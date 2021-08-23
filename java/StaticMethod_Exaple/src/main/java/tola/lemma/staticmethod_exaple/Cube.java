/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.staticmethod_exaple;

/**
 *
 * @author Tola Lemma
 */
//Static method need not to be intantiated while  invoking
 class Cube {
   
    static int cubex(int x){
    return (x*x*x);
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       int result= Cube.cubex(5);
        System.out.println(result);
    }
}
