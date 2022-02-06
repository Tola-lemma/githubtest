/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.methodoverrhiding;

/**
 *
 * @author Tola Lemma
 */
public class Vehicle {

    void run() {
        // Is overridden
        System.out.println(" Vehicle is running......");
    }
}

class Bike extends Vehicle {

    @Override
    void run() {
        //super.run();
        System.out.println("Bike is safely running........");
    }

    public static void main(String[] args) {
//        Bike obj = new Bike();
//        obj.run();
//         Vehicle obj1 = new Bike();// is upcasting outpur is the same as above
//         obj1.run();
       Vehicle[] v=new Vehicle[1];
       v[0]=new Bike();
       
       for(int i=0;i<v.length;i++){
       v[i].run();
       }
        //v[0].run();//output is of super class
//Bike test=new Vehicle();
//test.run();//RuntimeException
    }
}
