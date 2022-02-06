/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tola Lemma
 */
public class Excep_Handling {
    public static int Average(int[] ar){
		/*if(ar.length==0){
		 throw new IllegalArgumentException("array is empty"); 
		}*/
    int total =0;
    for(int i=0;i<ar.length;i++)
    {
        total +=ar[i];
    }
    return total/ar.length; 
    }
    public static void main(String[] args) {
         Excep_Handling abc=new  Excep_Handling();
        int[] b={};
        String s=null;  
        String st="abc";  
        int a[]=new int[5];
        int j=0;  
        int data;  

       try    {
           //System.out.println("The first Statement before exception in try keyword is displayed");
           System.out.println(abc.Average(b)+"  is output");
           System.out.println("second Statement After Exception in try keyword is not displayed ");
        /*unchecked
        If we have a null value in any variable,
        performing any operation on the variable throws a NullPointerException.
*/
           System.out.println(s.length());
        /*unchecked
Suppose we have a string variable that has characters;
converting this variable into digit will cause NumberFormatException.*/
       int p=Integer.parseInt(st);//NumberFormatException  
       /*unchecked
       When an array exceeds to it's size,
       the ArrayIndexOutOfBoundsException occurs.
       */
       a[10]=50; //ArrayIndexOutOfBoundsException  
       data=i/j; //may throw exception   
       }
        // handling the exception   
        catch(Exception ex){
       //catch(ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
              
             // resolving the exception in catch block  
            System.out.println(i/(j+2));  
        
       }
        
    }
}
