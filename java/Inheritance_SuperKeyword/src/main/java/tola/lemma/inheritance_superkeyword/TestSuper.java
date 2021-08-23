/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.inheritance_superkeyword;

/**
 *
 * @author Tola Lemma 
 */
class Animal{

Animal(){
    System.out.println("Animal is created");
}
}
  class Dog extends Animal{
      Dog(){
          // invoke immediate parent constructor
      super();//if there is super(); keyword it is provided by the compiler implicitly
      System.out.println("Dog is crested");
  }    
  }
public class TestSuper {
    public static void main(String[] args) {
        Dog d=new Dog();
    }
}
