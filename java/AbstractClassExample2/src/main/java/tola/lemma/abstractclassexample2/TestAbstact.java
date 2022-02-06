/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.abstractclassexample2;

/**
 *
 * @author Tola Lemma
 */
abstract class Shape {

    Shape() {
        System.out.println("TO TEST AS SUPER IMPLICITLY CALLED");
    }
 abstract void draw();
   
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {

    Circle() {
        super();
    }

    void draw() {
        System.out.println("Drawing Circle");
    }
}//method is called by programmer

public class TestAbstact {

    public static void main(String[] args) {
       /* Shape s;
        s = new Circle();
        */
        Shape s = new Circle();//also possible if i write like Circle s=new Circle(); but doesn't show abstraction
       Shape s1 = new Rectangle();
        s.draw();
         //s1.draw();
    }
}
