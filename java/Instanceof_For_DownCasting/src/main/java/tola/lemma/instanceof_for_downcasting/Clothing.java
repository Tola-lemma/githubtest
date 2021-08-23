/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.instanceof_for_downcasting;

/**
 *
 * @author Tola Lemma
 */
public class Clothing {}
class Shirt extends Clothing{
  static void method(){
//static void method(Clothind c){
//if(c instanceof Shirt){
//Shirt s=(Shirt)c;//Downcasting
System.out.println("Ok Down Casting");
}

    public static void main(String[] args) {
        /*
        
        Clothing c=new Shirt();
        Shirt.method(c);
        */
        Clothing c=new Shirt();
        Shirt s=(Shirt)c;//downcasting
        Shirt.method();
    }
}
