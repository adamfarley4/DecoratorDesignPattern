package com.company;
/*this class updates a christmas tree object to this class
it prints the tostring with the current tree and adds this
class as an extension, it then returns the trees price with
the addition of this classes cost
 */
public class Star extends TreeDecorator {
    ChristmasTree tree;
    public static final double cost = 6;
    Star(ChristmasTree tree){
        this.tree = tree;
    }
    //returns the tree name plus the star saying
    public String toString() {
        return tree.toString() + " + a star on top";
    }
    /*returns the cost plus the starcost
     */
    public double getCost(){
        return tree.getCost() + cost;
    }
}
