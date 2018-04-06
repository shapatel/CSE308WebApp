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

    Statistics s;
    public PopulationConstraint(Statistics s1){
        s = s1;
    }
    @Override
    public double calculateConstraint(Statistics s, CongressionalDistrict cd, int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
