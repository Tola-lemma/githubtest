/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.encapsulation;

/**
 *
 * @author Tola Lemma
 */
public class EncapExample {

    private String name;//private data member
//getter method for name

    public String getName() {
        return name;
    }
//setter method for name

    public void setName(String name) {
        this.name = name;
    }
}
// java class to test Encapsulate class

class Test {

    public static void main(String[] args) {
        //create instance of Encapsulated class
        EncapExample x = new EncapExample();
        //setting the value in the name member
        x.setName("Tola");
        // getting value of the name member
        System.out.println(x.getName());
    }
}
