/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Thomas
 */
public class GoodnessCalculator {
    Collection<Constraint> constraints;
    List<Measure> measures;
    Statistics stateStats;
    Map<String,Integer> weights;
    private double goodness;
    public double calculateGoodness(CongressionalDistrict cd, int year){
        //Double goodness = new Double(0) ;
        goodness = 0;
        Iterator<Constraint> iterate = constraints.iterator();
        iterate.forEachRemaining(c -> {
            goodness += -10*c.calculateConstraint(stateStats,cd,year);
        });
        for(int i=0; i<measures.size();i++){
            
            Integer gc = weights.get(measures.get(i).name);
            if(gc != null){
                double x = measures.get(i).calculate(stateStats,cd,year);
                goodness += gc*x;
            }
        }
            
        return goodness;
    }
    public void setWeights(Map<String,Integer> map)
    {
        weights = map;
    }
    public void setStatistics(Statistics s){
        stateStats = s;
    }

    public void setMeasures(List<Measure> m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
