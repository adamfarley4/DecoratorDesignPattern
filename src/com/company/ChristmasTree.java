package com.company;
/*this class creates a string variable to use in the tostring
, a tostring to print, and an
abstract getcost to update the cost of the items
 */
public abstract class ChristmasTree {
    protected String description;

    public String toString(){
        return description;
    }
    public abstract double getCost();
}
