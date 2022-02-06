/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.autoboxing_primitive2wrapperobj;

/**
 *
 * @author Tola Lemma
 */
public class AutoBoxingDemo {
    public static void main(String[] args) {
       Integer i=20;//Integer i=new Integer(20);// display unnecesary boxing to integer
        i=i+30;
        System.out.println("AotoBoxing "+i);
    }
    
}
