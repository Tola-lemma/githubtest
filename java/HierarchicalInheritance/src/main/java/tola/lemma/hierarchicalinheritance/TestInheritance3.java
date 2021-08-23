/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.hierarchicalinheritance;

/**
 *File : TestInheritance3.java
 * @author Tola Lemma
 */
class Animal {
void eat(){
System.out.println("Eating........");
}
}
class Dog extends Animal{
void bark(){
System.out.println("Barking........");
}
}
class Cat extends Animal{
void meow(){
System.out.println("Meowing......");
}
}
public class TestInheritance3 {
    public static void main(String[] args) {
     Cat c=new Cat();
     c.eat();
     c.meow();
     //c.bark();
    }
    
}
