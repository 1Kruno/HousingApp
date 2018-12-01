/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

/**
 *
 * @author x18110274
 * Krunoslav Bubanj
 */
public class Apartment extends Property{ //child class of Property class
    
    public Apartment(int xnoOfBeds, String xArea){ //overloaded constructor
        super(xnoOfBeds,xArea); 
    }
    
    public Apartment(){ //default constructor
        super(); //keyword for inheritance
    }

   
    
    
    
}
