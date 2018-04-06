/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servlets;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Exdata {
    private int id;
    private String name;
    private ArrayList<Indata> data;
    
    public Exdata(int i, String n, ArrayList<Indata> d){
        id = i;
        name = n;
        data = d;
    }
    
    public Exdata(){
        super();
    }
    
    public void setId(int ix){id = ix;}
    public void setName(String nm){name = nm;}
    public void setData(ArrayList<Indata> x){data = x;}
    
    
    public int getId(){return id;}
    public String getName(){return name;}
    public ArrayList<Indata> getData(){return data;}
}
