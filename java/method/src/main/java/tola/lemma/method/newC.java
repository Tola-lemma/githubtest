/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.method;

/**
 *
 * @author Tola Lemma
 */
//for input purposepackage tola.lemma.method;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.method;

/**
 *
 * @author Tola Lemma
 */
 class method {
    int x=5;
    int y=10;
}
    class method1 extends method{
    //int x=50;
    //int y=100;
   /* public void display()
    {
        //the use of super on Variable
System.out.println("now the result because of super keyword become  " + super.x);
System.out.println("now the result because of super keyword become  " + super.y);
    }*/
    }
public class newC {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        method1 c=new method1();
        //c.display();
        System.out.println("y=" + c.x);
    System.out.println("x=" + c.y);
       //addition of the two number using method and that number is user input 
      int a,b,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
z=addition(a,b);
System.out.println(" Addition of two numbers is : "+z);
    
            }
    static int addition(int d,int e){
        return d+e;
    }
}
