/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.static_block;

/**
 *
 * @author Tola Lemma
 */
// static block
 //excuted at time of class loading before  main method
public class TestB {
    static {
        System.out.println("Static block .");
    }
    public static void main(String[] args) {
        System.out.printf("%s%n","hello world from main method");
    }
    
}
