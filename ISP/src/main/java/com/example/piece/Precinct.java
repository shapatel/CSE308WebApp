package com.example.piece;
import java.util.ArrayList;

public class Precinct {
	//Attributes:
	int id;
	String name;
	int congressionalDistrictId;
	Statistics stats;
	ArrayList<Precinct> adjacentPrecincts;
	boolean incumbent;
	boolean isBorder;
	boolean locked;
	String geoJson;
	int year;
	
	
	//Constructors
	public Precinct() {
		super();
	}
	public Precinct(int id, String name, Statistics stats, ArrayList<Precinct> adjacentPrecincts, boolean incumbent,
			boolean locked, String geoJson) {
		super();
		this.id = id;
		this.name = name;
		this.stats = stats;
		this.adjacentPrecincts = adjacentPrecincts;
		this.incumbent = incumbent;
		this.locked = locked;
		this.geoJson = geoJson;
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
	
	
	public int getCongressionalDistrictId() {
		return congressionalDistrictId;
	}
	public void setCongressionalDistrictId(int congressionalDistrictId) {
		this.congressionalDistrictId = congressionalDistrictId;
	}
	
	public Statistics getStats() {
		return stats;
	}
	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	
	public ArrayList<Precinct> getAdjacentPrecincts() {
		return adjacentPrecincts;
	}
	public void setAdjacentPrecincts(ArrayList<Precinct> adjacentPrecincts) {
		this.adjacentPrecincts = adjacentPrecincts;
	}
	
	public boolean isIncumbent() {
		return incumbent;
	}
	public void setIncumbent(boolean incumbent) {
		this.incumbent = incumbent;
	}
	
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	public String getGeoJson() {
		return geoJson;
	}
	public void setGeoJson(String geoJson) {
		this.geoJson = geoJson;
	}
	
	public boolean isBorder() {
		return isBorder;
	}
	public void setBorder(boolean isBorder) {
		this.isBorder = isBorder;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	
	
}
