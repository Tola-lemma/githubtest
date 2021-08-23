/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.finding_largest_of_3_num;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        int num1,num2,num3,temp,result;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=scan.nextInt();
        System.out.println("Enter the Second number:");
        num2=scan.nextInt();
        System.out.println("Enter the Third number:");
        num3=scan.nextInt();
        scan.close();
        temp=num1>num2?num1:num2;
        result=num3>temp?num3:temp;
        System.out.println("The largest of the three number is : "+ result);
   
    }
    
}
