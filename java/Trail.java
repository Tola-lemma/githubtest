/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.keywords;

/**
 *The use of  "this" keywords
 * "this" keyword cannot be referenced from a "static" context.
 * NON STATIC METHOD CANNOT BE REFERENCED FROM A STATIC CONTEXT.
 * @author hp
 */
public class Trail {
    int a,b;
  public /*static */ void sample(int a,int b ) 
    {
//      a=a;
//      b=b;
        this.a=a;
        this.b=b;
   System.out.println("a= "+a);
   System.out.println("b= "+b);
    }
    public static void main(String[] args) {
       //sample(4,3);
       Trail  x=new Trail();
       x.sample(4,3);
     System.out.println("a= "+x.a);
     System.out.println("b= "+x.b);
        
    }
    
}
