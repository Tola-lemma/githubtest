/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.constructorexample;

/**
 *
 * @author Tola Lemma
 */
public class ConstructorExample1 {
   static String x;
    ConstructorExample1(){
        this("defualt");
        System.out.println("Hello passing no parameter");}
    ConstructorExample1(String x){
        this.x=x;
       
    }
    void display(String x){
     System.out.println(x);
    
    }
    public static void main(String[] args) {
        ConstructorExample1 b=new ConstructorExample1("hello home");
        b.display(x);
    }
}
