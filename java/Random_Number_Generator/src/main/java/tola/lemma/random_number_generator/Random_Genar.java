/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tola.lemma.random_number_generator;
import java.util.Random;
/**
 *
 * @author Tola Lemma
 */
public class Random_Genar {
    public static void main(String[] args) {
       Random dice=new Random();
       Random r=new Random();
        Random ro=new Random();
       int n;
       int rn;
       int rOdd;
       for(int i=1;i<=10;i++){
           rOdd=ro.nextInt(50)*2+1;//random odd number from 1 to 100
       rn=r.nextInt(25)+25;//random number from 25 to 49
       n=dice.nextInt(12)-5;//random number from -5 to 6
       //n=dice.nextDouble()*0.2+1.5 between 1.5 to 1.7
       System.out.print(rOdd+"\t");
           //System.out.println(" ");
       // System.out.print(rn+"\t");
          // System.out.print(n+"\t");
       }
    }
    
}
