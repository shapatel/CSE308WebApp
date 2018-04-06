package com.example.piece;

import java.util.ArrayList;

public class State {
	
	//Attributes:
	String name;
	ArrayList<CongressionalDistrict> districts;
	Statistics stateStats;
	String geoJson;
	
	//Constructors
	public State() {
		super();
	}
	public State(String name, ArrayList<CongressionalDistrict> districts, Statistics stateStats, String geoJson) {
		super();
		this.name = name;
		this.districts = districts;
		this.stateStats = stateStats;
		this.geoJson = geoJson;
	}

	//Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<CongressionalDistrict> getDistricts() {
		return districts;
	}
	public void setDistricts(ArrayList<CongressionalDistrict> districts) {
		this.districts = districts;
	}
	
	public Statistics getStateStats() {
		return stateStats;
	}
	public void setStateStats(Statistics stateStats) {
		this.stateStats = stateStats;
	}
	
	public String getGeoJson() {
		return geoJson;
	}
	public void setGeoJson(String geoJson) {
		this.geoJson = geoJson;
	}
	
	//Methods
	public CongressionalDistrict getDistrictById(int id) {
		return districts.get(id);
	}
	
	
	
	
}
