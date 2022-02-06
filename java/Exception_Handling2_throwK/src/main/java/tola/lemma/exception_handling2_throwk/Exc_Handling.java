 //THROW UNCHECKED EXCEPTIOn
/*
        In this example, we have created the validate method
        that takes integer value as a parameter. 
        If the age is less than 18, 
        we are throwing the ArithmeticException 
        otherwise print a message welcome to vote.
        */  
package tola.lemma.exception_handling2_throwk;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;

public class Exc_Handling {
    public static class zException extends Exception {

    public zException(String str) {
    }
    
}
    //Method to check if person is eligible to vote or not  
     public static void validate(int age) throws zException {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new zException("You are not 1eligible to vote");    
        }  
       
    }  
    public static void main(String[] args) { 
        try {
            Scanner input=new Scanner(System.in);
            //calling the function
            System.out.println("Please Enter your Age to vote");
            int age=input.nextInt();
            validate(age);    
            System.out.println("Welcome You are eligible to vote!!!  rest of the code will be excuted...");
        } catch (zException ex) {
            System.out.println(ex);
        }
  }       
}
