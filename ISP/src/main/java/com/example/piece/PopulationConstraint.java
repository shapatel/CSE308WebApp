/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece;

/**
 *
 * @author Thomas
 */
public class PopulationConstraint extends Constraint {

    private Statistics s;
    private final double deviation = .25;
    public PopulationConstraint(Statistics s1){
        s = s1;
    }
    @Override
    public double calculateConstraint(Statistics s, CongressionalDistrict cd, int year) {
        long  p = s.getPopulation()/9;
        long h = cd.getStatisticsByYear(year).getPopulation();
        if((h<(long)(p*(1.0-deviation))) || (h > (long)(p*(1.0+deviation)))){
            double j = Math.abs(h-p);
            return j;
        }
        return 0;
    }
    public void setStatistics(Statistics stats){
        s = stats;
    }
}
