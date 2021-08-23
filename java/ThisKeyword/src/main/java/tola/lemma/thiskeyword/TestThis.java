/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.thiskeyword;

/**
 *
 * @author Tola Lemma
 */
//USED TO INVOKE CURRENT CLASS METHOD
class A{
    static String college= "BBG";
void m(){
    System.out.println("Hello world from class Superclass");
}
void n(){
    System.out.println("Hello world from n method");
    m();
   //this.m();
}
}
public class TestThis {
    public static void main(String[] args) {
        A a=new A();
        A.college="AAU";
        System.out.println(A.college);
        a.n();
        
    }
    
}
