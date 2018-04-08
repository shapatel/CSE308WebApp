/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.piece.web;

import com.example.piece.CongressionalDistrict;
import com.example.piece.Precinct;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
class ChangeLog {
    public ArrayList<ChangeEntry> changes = new ArrayList<ChangeEntry>();
    
    public void clear(){
        changes.clear();
    }

    void addEntry(Precinct p, CongressionalDistrict cD1, CongressionalDistrict cD2, double d) {
        changes.add(new ChangeEntry(p,cD1,cD2));
    }
}
