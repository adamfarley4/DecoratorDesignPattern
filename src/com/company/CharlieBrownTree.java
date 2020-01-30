package com.company;
/* this class sets the description in the default constructor and
returns the cost of the tree
 */
public class CharlieBrownTree extends ChristmasTree {
    CharlieBrownTree(){
        this.description = "Charlie Brown's Christmas tree";
    }
    public static final double cost = 5;
    public double getCost(){
        return cost;
    }
}
