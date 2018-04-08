package com.example.piece;
import java.util.ArrayList;
import java.util.HashMap;
public class CongressionalDistrict {
	
	//Attributes
	int id;
	String name;
	HashMap<Integer,ArrayList<Precinct>> precincts;
	HashMap<Integer,Statistics> stats;
	boolean locked;
	double goodness;
	
	
	//Constructors
	public CongressionalDistrict() {
		super();
	}

	public CongressionalDistrict(int id, String name, HashMap<Integer, ArrayList<Precinct>> precincts, boolean locked,
			double goodness) {
		super();
		this.id = id;
		this.name = name;
		this.precincts = precincts;
		this.locked = locked;
		this.goodness = goodness;
	}
	
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public HashMap<Integer, ArrayList<Precinct>> getPrecincts() {
		return precincts;
	}

	public void setPrecincts(HashMap<Integer, ArrayList<Precinct>> precincts) {
		this.precincts = precincts;
	}

	
	public boolean getLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	
	public double getGoodness() {
		return goodness;
	}

	public void setGoodness(double goodness) {
		this.goodness = goodness;
	}
	
	//Methods
	public boolean verify() {
		return false;
	}
	public void setStatisticsByYear(HashMap<Integer,Statistics> ser)
        {
            stats = ser;
        }
	public Statistics getStatisticsByYear(int year) {
		return stats.get(year);
	}
	
	public ArrayList<Precinct> getOuterBorderPrecinctsByYear(int year){
		ArrayList<Precinct> outerBorder = new ArrayList<Precinct>();
		for(Precinct precinct : precincts.get(year)) {
			if(precinct.isBorder()) {
				for(Precinct p : precinct.getAdjacentPrecincts()) {
					if(precinct.getCongressionalDistrictId()!=p.getCongressionalDistrictId()) {
                                                if(!outerBorder.contains(p))
                                                    outerBorder.add(p);
					}
				}
			}
		}
		return outerBorder;
	}
	
	//Need to manage removal of statistics from the district
	public void removePrecinct(Precinct p) {
		precincts.get(p.getYear()).remove(p);
                getStatisticsByYear(p.getYear()).removeStatistics(p.getStats());
                
                ArrayList<Precinct> ps = p.getAdjacentPrecincts();
                for(int i=0;i<ps.size();i++){
                    ArrayList<Precinct> ap = ps.get(i).getAdjacentPrecincts();
                    boolean borderbool = false;
                    for(int j = 0; j< ap.size();j++){
                        if(ap.get(j).getCongressionalDistrictId()!=id)
                        {
                            borderbool = true;
                            ap.get(j).setBorder(borderbool);
                            j = ap.size()+1;
                            break;
                        }
                        else{
                        ap.get(j).setBorder(borderbool);
                        }
                    }
                }
	}
	//Need to manage addition of statistics from the district
	public void addPrecinct(Precinct p) {
		precincts.get(p.getYear()).add(p);
                getStatisticsByYear(p.getYear()).appendStatistics(p.getStats());
                p.setCongressionalDistrictId(id);
                ArrayList<Precinct> ps = p.getAdjacentPrecincts();
                for(int i=0;i<ps.size();i++){
                    ArrayList<Precinct> ap = ps.get(i).getAdjacentPrecincts();
                    boolean borderbool = false;
                    for(int j = 0; j< ap.size();j++){
                        if(ap.get(j).getCongressionalDistrictId()!=id)
                        {
                            borderbool = true;
                            ap.get(j).setBorder(borderbool);
                            j = ap.size()+1;
                            break;
                        }else{
                        ap.get(j).setBorder(borderbool);}
                    }
                }
	}

	public ArrayList<Precinct> getPrecinctsByYear(int year){
		return precincts.get(year);
	}



}
