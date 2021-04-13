/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9;

import java.util.Scanner;

/**
 *
 * @author Jacks
 */
public class Lab9Main { public static void main(String[] args) {
    double len1 = 0;
    double len2 = 0;
    double width1 = 0;
    double width2 = 0;
    Scanner Keyboard = new Scanner(System.in);
    
    System.out.println("Hello! what is the length of your first Land Tract?");
    len1 = Keyboard.nextInt();
    
     System.out.println("Hello! what is the width of your first Land Tract?");
    width1 = Keyboard.nextInt();
    
     System.out.println("Hello! what is the length of your second Land Tract?");
    len2 = Keyboard.nextInt();
    
     System.out.println("Hello! what is the width of your second Land Tract?");
    width2 = Keyboard.nextInt();
    
    
    LandTract LandTract1 = new LandTract(len1,width1);
    LandTract LandTract2 = new LandTract(len2,width2);
    
    System.out.println("The area of Land Tract 1 is " + LandTract1.getArea() + " units");
     System.out.println("The area of Land Tract 2 is " + LandTract2.getArea() + " units");
     
     if (LandTract1.equals(LandTract2)){
         System.out.println("The Land Tracts have equal areas");
     }
     else { System.out.println("The Land Tracts do NOT have equal areas");}
         
     
         }
    }
 
            
    
    
    
    
    

