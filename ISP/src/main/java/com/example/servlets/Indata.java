/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.servlets;

/**
 *
 * @author Thomas
 */
public class Indata {
    private String name,address,job;
    private double pay,gpa,score;
    public Indata(){
        super();
    }
    public void setName(String n){
        name = n;
    }
    public void setAddress(String n){
        address = n;
    }
    public void setJob(String n){
        job = n;
    }
    public void setPay(double n){
        pay = n;
    }
    public void setGpa(double n){
        gpa = n;
    }
    public void setScore(double n){
        score = n;
    }
    
    public String setName(){
        return name;
    }
    public String setAddress(){
        return address;
    }
    public String setJob(){
        return job;
    }
    public double setPay(){
      return pay;
    }
    public double setGpa(){
      return gpa;
    }
    public double setScore(){
      return score;
    }
}
