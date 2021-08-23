/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tola Lemma
 */
 //Creating Static variable Method and blocks
public class StaticEx {
  
    static int ad = 100;
    static int bc = 200;
    static {
        ad += 1;// usage of non final variable during initializing
        bc += 1;
    }
    public static void main(String args[]) {
        ad += 5;
        bc += 10;
        System.out.println(ad + bc);
    }
    static {
        ad += 100;
        bc += 200;
    }
}
    

