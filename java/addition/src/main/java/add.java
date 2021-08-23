/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;
public class add {
public static int  addition(int x,int y){
      return x+y;
  }  
    /**
     *
     * @param args
     */
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int a,b,sum;
    System.out.println("Enter the first number");
    a=input.nextInt();
    System.out.println("Enter the second number");
    b=input.nextInt();
    sum=addition(a,b);
    System.out.println("the sum of the number is "+ sum);

    /**
     *
     * @param x
     * @param y
     * @return
     */
    
}
}