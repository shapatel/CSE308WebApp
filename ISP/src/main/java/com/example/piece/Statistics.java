package com.example.piece;

import java.util.HashMap;

public class Statistics {
	
	//Attributes
	long population;
	HashMap<String, Long> racialDemographics;
	HashMap<String, Long> socioEconomicDemographics;
	HashMap<String, Long> partisanAllegiances;
	HashMap<String, Long> electionResults;
	
	//Constructors
	
	public Statistics() {
		super();
	}

	public Statistics(long population, HashMap<String, Long> racialDemographics,
			HashMap<String, Long> socioEconomicDemographics, HashMap<String, Long> partisanAllegiances,
			HashMap<String, Long> electionResults) {
		super();
		this.population = population;
		this.racialDemographics = racialDemographics;
		this.socioEconomicDemographics = socioEconomicDemographics;
		this.partisanAllegiances = partisanAllegiances;
		this.electionResults = electionResults;
	}
	
	//Getters and Setters
	
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}

	public HashMap<String, Long> getRacialDemographics() {
		return racialDemographics;
	}
	public void setRacialDemographics(HashMap<String, Long> racialDemographics) {
		this.racialDemographics = racialDemographics;
	}

	public HashMap<String, Long> getSocioEconomicDemographics() {
		return socioEconomicDemographics;
	}
	public void setSocioEconomicDemographics(HashMap<String, Long> socioEconomicDemographics) {
		this.socioEconomicDemographics = socioEconomicDemographics;
	}

	public HashMap<String, Long> getPartisanAllegiances() {
		return partisanAllegiances;
	}
	public void setPartisanAllegiances(HashMap<String, Long> partisanAllegiances) {
		this.partisanAllegiances = partisanAllegiances;
	}

	public HashMap<String, Long> getElectionResults() {
		return electionResults;
	}
	public void setElectionResults(HashMap<String, Long> electionResults) {
		this.electionResults = electionResults;
	}
	
	//Methods
	public void appendStatistics(Statistics s) {
		population+=s.getPopulation();
	}
	public void removeStatistics(Statistics s) {
		population-=s.getPopulation();
	}
	
	
	
	
}
