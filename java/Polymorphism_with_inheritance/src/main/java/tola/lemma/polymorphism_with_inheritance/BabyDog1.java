/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.polymorphism_with_inheritance;

/**
 *
 * @author Tola Lemma
 */
class Animal{  
void eat(){System.out.println("animal is eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("dog is eating...");}  
}  
class BabyDog1 extends Dog{  
public static void main(String args[]){  
Animal a=new BabyDog1();  
a.eat();  
}}  
