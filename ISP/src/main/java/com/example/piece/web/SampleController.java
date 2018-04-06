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
import com.example.piece.GoodnessCalculator;
import com.example.piece.Measure;
import com.example.piece.PartisanMeasure;
import com.example.piece.PopulationConstraint;
import com.example.piece.Precinct;
import com.example.piece.State;
import com.example.piece.service.HelloWorldService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
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
        public boolean startAlgorithm(Map<String,Integer> params){
            boolean ready = false;
            State state = new State();
            GoodnessCalculator gc = new GoodnessCalculator();
            gc.setWeights(params);
            gc.setStatistics(state.getStateStats());
            List<Measure> m = new ArrayList<Measure>();
            for(int i=0;i<params.size();i++){
                if(params.get("Partisan")!= null){
                   m.add(new PartisanMeasure());
                }
                
            }
            gc.setMeasures(m);
            Collection<Constraint> c = new ArrayList<Constraint>();
            c.add(new PopulationConstraint(state.getStateStats()));
            changes.clear();
            ready = true;
            return ready;
        }
        public String runAlgorithm(@RequestParam(value = "cdid",required = true) int cdid){
            State s = new State();
            int year = 0;
            GoodnessCalculator gc = new GoodnessCalculator();
            CongressionalDistrict cD1 = s.getDistrictById(cdid);
            ArrayList<Precinct> precincts = cD1.getOuterBorderPrecinctsByYear(year);
            for(int i = 0; i<precincts.size();i++){
                Precinct p = precincts.get(i);
                int cdid2 = p.getCongressionalDistrictId();
                CongressionalDistrict cD2 = s.getDistrictById(cdid2);
                if(cD2.getLocked() || cD1.getLocked()){}{
                    if((cD1.getGoodness() == 0) || (cD2.getGoodness() == 0)){
                        cD1.setGoodness(gc.calculateGoodness(cD1,year));
                        cD2.setGoodness(gc.calculateGoodness(cD2,year));
                    }
                    swapDistricts(p,cD1,cD2);
                    double sum = cD1.getGoodness()+cD2.getGoodness();
                    double a = gc.calculateGoodness(cD1,year);
                    double b = gc.calculateGoodness(cD2,year);
                    if(sum < a+b)
                    {
                        cD1.setGoodness(a);
                        cD2.setGoodness(b);
                        changes.addEntry(p,cD1,cD2,(a+b)-sum);                
                    }
                    else
                        swapDistricts(p,cD2,cD1);
                }
            }
            String json;
            try{
                json = om.writeValueAsString(changes);
            }
            catch(Exception e){
                json = e.getMessage();
            }
            changes.clear();
            return json;
            
        }

    private void swapDistricts(Precinct p, CongressionalDistrict cD1, CongressionalDistrict cD2) {
        cD1.addPrecinct(p);
        cD2.removePrecinct(p);
        //p.setCongressionalDistrict(cD1.getId());
        
    }
}
        
        
        
        
       