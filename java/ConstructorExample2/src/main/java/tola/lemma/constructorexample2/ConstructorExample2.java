/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.constructorexample2;

/**
 *
 * @author Tola Lemma
 */
public class ConstructorExample2 {
    int id;
  String name;
    ConstructorExample2(int i,String n){
     id=i;
        name=n;
    }
//    void display(){
//        System.out.println(id +" " +name);
//    }
    //Replaced with 
    @Override
    public String toString(){
    return id+" "+name;
    } 
    public static void main(String[] args) {
        ConstructorExample2 cons=new ConstructorExample2(2825,"Tola Lemma");
        ConstructorExample2 cons2=new ConstructorExample2(8100,"Tola Wake");
       System.out.println(cons);
       System.out.println(cons2.toString()); 
     /**
         * below print the  hashcode of the value
         * System.out.println(cons); is the same as 
         * System.out.println(cons.toString());
         * both print the hashcode of the value
         */
    //this prints value of the object
//        cons.display();
//        cons2.display();
//replaced with

    }
}
