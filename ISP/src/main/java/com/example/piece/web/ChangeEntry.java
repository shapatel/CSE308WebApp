/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece.web;

import com.example.piece.CongressionalDistrict;
import com.example.piece.Precinct;

/**
 *
 * @author Thomas
 */
class ChangeEntry {
    //Provides Only Names and Ids to be sent to front
    public String precinct;
    public int taker;
    public int giver;
    ChangeEntry(Precinct p, CongressionalDistrict cD1, CongressionalDistrict cD2) {
        precinct = p.getName();
        taker = cD1.getId()+1;
        giver = cD2.getId()+1;
    }
    
}
