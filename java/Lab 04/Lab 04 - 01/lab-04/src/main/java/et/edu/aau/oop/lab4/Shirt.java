/*
 * Java Fundamentals
 * Lab 4-1 Viewing and Adding Code to an Existing Java Program
 */
package et.edu.aau.oop.lab4;

/**
 * A class to model the Shirt Object
 *
 * @author Yoseph Berhanu<yoseph.berhanu@aau.edu.et>
 * @version 1.0
 * @since 1.0
 */
public class Shirt {

    public int shirtID = 0; // Default ID for the shirt
    public String description = "-description required-"; // default
    // The color codes are R=Red, B=Blue, G=Green, U=Unset
    public char colorCode = 'U';
    public double price = 0.0; // Default price for all shirts
    public int quantityInStock = 0;

    // This method displays the values for an item
    public void displayInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);

    } // end of display method
} // end of class

