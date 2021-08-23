/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.thiskeyword3;

/**
 *
 * @author Tola Lemma
 */
//PASS ARGUMENT IN THE METHOD CALL
class  A{

    //calling parametraized method
    A(){
   this(30); 
  System.out.println("HELLO A");
 
    }
    A(int x){
        System.out.println(x);}
}
public class TestThis3 {
    public static void main(String[] args) {
       A obj=new A();   
    }
  
}
