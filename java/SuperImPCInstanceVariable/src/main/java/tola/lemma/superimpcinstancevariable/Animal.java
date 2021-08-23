/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.superimpcinstancevariable;

/**
 *
 * @author Tola Lemma
 */
public class Animal {
    String color="White ";
}
class Dog extends Animal{
String color ="Black";
void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper{
    public static void main(String[] args) {
      Dog d=new Dog();
       d.printColor();
    }
}