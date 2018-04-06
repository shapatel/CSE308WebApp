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
public abstract class Measure {
    
    String name;
    
    public abstract double calculate(Statistics s, CongressionalDistrict cd, int year);
}
