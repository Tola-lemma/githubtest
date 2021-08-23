/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.instanceof_example;

/**
 *
 * @author Tola Lemma
 */
public class Animal { 
}
class Dog extends Animal{
//Dog inherits Animal
    public static void main(String[] args) {
        Animal a=new Dog();
     Dog d=(Dog)a;//Dog d=new Animal(); error Animal cannot converted to Dog
        System.out.println(d instanceof Animal);
    }
}
