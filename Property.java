/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

import java.io.Serializable;

/**
 *
  * @author x18110274
 *  Krunoslav Bubanj
 */
public class Property extends HousingGUI{ //superclass/parent class
   
    //declaration of data members
    protected int noOfBeds;
    protected String Area;
    protected int price;

    //constructor
    public Property(){
        noOfBeds = 0;
        Area = "";
    }
    //overloaded constructor
    public Property(int noOfBeds, String Area){
        this.noOfBeds = noOfBeds;
        this.Area = Area;
    }
    //dm noOfBeds getter
    public int getNoOfBeds() {
        return noOfBeds;
    }
    //dm noOfBeds setter
    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }
    //dm Area getter
    public String getArea() {
        return Area;
    }
    //dm Area setter
    public void setArea(String Area) {
        this.Area = Area;
    }
    //dm price getter
    public int getPrice() {
        return price;
    }
    //dm price setter
    public void setPrice(int price) {
        this.price = price;
    }

    
}
