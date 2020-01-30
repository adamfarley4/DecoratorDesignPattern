package com.company;
/* this class sets the description in the default constructor and
returns the cost of the tree
 */
public class FakeChristmasTree extends ChristmasTree{
    FakeChristmasTree(){
        this.description = "Artifical Christmas tree";
    }
    public static final double cost = 50;
    public double getCost(){
        return cost;
    }
}
