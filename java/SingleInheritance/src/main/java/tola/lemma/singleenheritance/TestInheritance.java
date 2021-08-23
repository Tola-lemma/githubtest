/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.singleenheritance;

/**
 *File:TestInheritance.java
 * @author Tola Lemma 
*/
class Animal{
  void eat(){
  System.out.println("Eating....");
  }  
}
class Dog extends Animal{
void bark(){
    System.out.println("Barking....");
}
}
        
public class TestInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
