/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece.web;

/**
 *
 * @author Thomas
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.piece.CongressionalDistrict;
import com.example.piece.Constraint;
import com.example.piece.Dummy;
import com.example.piece.GoodnessCalculator;
import com.example.piece.Measure;
import com.example.piece.PartisanMeasure;
import com.example.piece.PopulationConstraint;
import com.example.piece.Precinct;
import com.example.piece.State;
import com.example.piece.Statistics;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    State s = new State();
    GoodnessCalculator gn;
    ChangeLog changes = new ChangeLog();
    ObjectMapper om = new ObjectMapper();
//	@Autowired
//	private HelloWorldService helloWorldService;
//        
//        @GetMapping("/newjsf")
//        public String texts(@RequestParam(name = "name",required=false,defaultValue="World") String name, Model model){
//            model.addAttribute("name",name);
//            return "newjsf";
//        }
//        @GetMapping("/")
//        @ResponseBody
//        public String app(@RequestParam(name = "name",required=false,defaultValue="World") String name){
//            
//            return name;
//        }
    //Session Things go here
    @GetMapping("/")
    @ResponseBody
    public String setupState(@RequestParam(name = "Massachussetts", required = false, defaultValue = "Massachussetts") String name) {
        if (name.equals(new String("Massachussetts"))) {
            //Set up Dummy Precincts
            Dummy d = new Dummy();
            ArrayList<CongressionalDistrict> cdlist = new ArrayList<CongressionalDistrict>();
            for (int i = 0; i < 9; i++) {
                ArrayList<Precinct> pts = d.formPrecincts(i);
                Statistics sa = new Statistics();
                long pops = 0;
                for (int j = 0; j < pts.size(); j++) {
                    pops += pts.get(j).getStats().getPopulation();
                }
                sa.setPopulation(pops);
                CongressionalDistrict cd = new CongressionalDistrict();
                HashMap<Integer, ArrayList<Precinct>> map = new HashMap<Integer, ArrayList<Precinct>>();
                HashMap<Integer, Statistics> mapstat = new HashMap<Integer, Statistics>();
                mapstat.put(2016, sa);
                map.put(2016, pts);
                cd.setPrecincts(map);
                cd.setId(i);
                cd.setLocked(false);
                cd.setGoodness(0);
                cd.setName("" + i);
                cd.setStatisticsByYear(mapstat);
                cdlist.add(cd);
            }
            //Set up Dummy State
            State massa = new State();
            massa.setDistricts(cdlist);
            massa.setName("Massachussetts");
            Statistics s1 = new Statistics();
            long pops1 = 0;
            //Setup Statistics
            for (int j = 0; j < massa.getDistricts().size(); j++) {
                CongressionalDistrict sop = cdlist.get(j);
                Statistics god = sop.getStatisticsByYear(2016);
                pops1 += god.getPopulation();
            }
            s1.setPopulation(pops1);
            massa.setStateStats(s1);
            d.randomAdj(massa);
            s = massa;
            HashMap<String, Integer> options = new HashMap<String, Integer>();
            startAlgorithm(options);
            String ple = "Massachussetts State Setup:<br>";
            for (int b = 0; b < 9; b++) {
                ple += "CHANGES: " + runAlgorithm(b) + "<br><br>";
            }
            ple += printSetup();
            return ple;
        }
        return "Choose Massachussetts, as currently, it is the only implemented state!";
    }

    public boolean startAlgorithm(HashMap<String, Integer> params) {
        boolean ready = false;
        
        State state = s;
        GoodnessCalculator gc = new GoodnessCalculator();
        
        gc.setWeights(params);
        gc.setStatistics(state.getStateStats());
        //Measures are not set up
        ArrayList<Measure> m = new ArrayList<Measure>();
        for (int i = 0; i < params.size(); i++) {
            if (params.get("Partisan") != null) {
                m.add(new PartisanMeasure());
            }

        }
        gc.setMeasures(m);
        //Constraints are Setup
        Collection<Constraint> c = new ArrayList<Constraint>();
        c.add(new PopulationConstraint(state.getStateStats()));
        gc.setConstraints(c);
        gn = gc;
        changes.clear();
        ready = true;
        return ready;
    }

    public String runAlgorithm(@RequestParam(value = "cdid", required = true) int cdid) {
        int year = 2016;
        GoodnessCalculator gc = gn;
        CongressionalDistrict cD1 = s.getDistrictById(cdid);
        ArrayList<Precinct> precincts = cD1.getOuterBorderPrecinctsByYear(year);
        for (int i = 0; i < precincts.size(); i++) {
            Precinct p = precincts.get(i);
            int cdid2 = p.getCongressionalDistrictId();
            CongressionalDistrict cD2 = s.getDistrictById(cdid2);
            double a,b = 0;
            if (cD2.getLocked() || cD1.getLocked()) {}
            {
                if ((cD1.getGoodness() == 0) || (cD2.getGoodness() == 0)) {
                    cD1.setGoodness(gc.calculateGoodness(cD1, year));
                    cD2.setGoodness(gc.calculateGoodness(cD2, year));
                }
                swapDistricts(p, cD1, cD2);
                double sum = cD1.getGoodness() + cD2.getGoodness();
                a = gc.calculateGoodness(cD1, year);
                b = gc.calculateGoodness(cD2, year);
                if (sum < a + b) {
                    cD1.setGoodness(a);
                    cD2.setGoodness(b);
                    changes.addEntry(p, cD1, cD2, (a + b) - sum);
                } else {
                    swapDistricts(p, cD2, cD1);
                }
            }
        }
        String json;
        try {
            json = om.writeValueAsString(changes);
        } catch (JsonProcessingException e) {
            json = e.getMessage();
        }
        changes.clear();
        return json;

    }

    private void swapDistricts(Precinct p, CongressionalDistrict cD1, CongressionalDistrict cD2) {
        cD1.addPrecinct(p);
        cD2.removePrecinct(p);
    }

    private String printSetup() {
        String pl = "<br>";
        for (int y = 0; y < s.getDistricts().size(); y++) {
            pl += "<br><b>Congressional District " + (y + 1) + ":</b> ";
            ArrayList<Precinct> gor = s.getDistricts().get(y).getPrecinctsByYear(2016);
            for (int u = 0; u < gor.size(); u++) {
                pl += "<br>" + gor.get(u).getName();
            }
        }
        return pl;
    }
}
