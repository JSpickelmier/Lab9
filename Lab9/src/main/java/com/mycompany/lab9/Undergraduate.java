/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9;

/**
 *
 * @author Jacks
 */
public class Undergraduate extends Student {
    private String Year;
    
    public Undergraduate (String StudentID, String firstName, String lastName, String Year){
        super (StudentID, firstName, lastName);
        this.Year = Year;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }
    
}
