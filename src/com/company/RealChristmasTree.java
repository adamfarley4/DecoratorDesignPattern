package com.company;
/* this class sets the description in the default constructor and
returns the cost of the tree
 */
public class RealChristmasTree extends ChristmasTree{
    RealChristmasTree(){
        this.description = "Real Fir Christmas Tree";
    }
    public static final double cost = 40;
    public double getCost(){
        return cost;
    }
}
