package com.company;
/*this class updates a christmas tree object to this class
it prints the tostring with the current tree and adds this
class as an extension, it then returns the trees price with
the addition of this classes cost
 */
public class Tinsel extends TreeDecorator {
    ChristmasTree tree;
    public static final double cost = 2;
    Tinsel(ChristmasTree tree){
        this.tree = tree;
    }
    //returns the tree name plus the tinsel saying
    public String toString() {
        return tree.toString() + " + tinsel all around";
    }
    /*returns the cost plus the tinselcost
     */
    public double getCost(){
        return tree.getCost()+ cost;
    }
}
