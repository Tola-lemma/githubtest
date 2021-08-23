/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.abstractionexample3;

/**
 *
 * @author Tola Lemma
 */
//Example of abstact class that has
//abstract and non abstract method,constructor and data member
abstract class Car {

    Car() {
        System.out.println("Car is Created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}

class Ford extends Car {

    void run() {
        System.out.println("Running Safely");
    }
}

public class TestClass4A {

    public static void main(String[] args) {
        Car obj = new Ford();
        obj.run();
        obj.changeGear();
    }
}
