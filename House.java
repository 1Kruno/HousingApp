/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

/**
 *
  * @author x18110274
 *  Krunoslav Bubanj
 */
public class House extends Property{ //child class of Property class
    
    
    public House(){ //default constructor
        super(); //inheritance keyword
    }
    
    public House(String Area, int noOfBeds){ //overloaded constructor
        super(noOfBeds, Area);
        this.Area = Area;
    }

}
