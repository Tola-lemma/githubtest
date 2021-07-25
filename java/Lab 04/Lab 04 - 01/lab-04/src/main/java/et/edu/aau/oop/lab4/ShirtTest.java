/*
 * Java Fundamentals
 * Lab 4 Intoduction 
 */
package et.edu.aau.oop.lab4;

/**
 * A class to instantiate a Shirt object and test it's methods
 *
 * @author Yoseph Berhanu<yoseph.berhanu@aau.edu.et>
 * @version 1.0
 * @since 1.0
 */
public class ShirtTest {

    /**
    *    Instructions
    *       1. Examine the lines of code in this file and in Shirt.java
    *       2. Modify the program to set the color code, description and price 
    *           before displaying shirt information
    *       3. Run the program to see the effect of the modification
    *       4. Put a few breaking points by clicking on the line number left 
    *           side of this editor. (note that breakpoints can only be set on 
    *           executable line of code, not comments or blank lines);
    *       5. This time, instead of using the run button in NetBeans use the debug button
    *           to debug this program
    *       6. Examine the values in memory to see the change in real time
    */
    public static void main(String[] args) {
        Shirt myShirt;
        myShirt = new Shirt();

        myShirt.displayInformation();

    }
} // end of class

