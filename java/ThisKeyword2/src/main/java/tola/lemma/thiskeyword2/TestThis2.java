/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.thiskeyword2;

/**
 *
 * @author Tola Lemma
 */
//USED TO INVOKE CURRENT CLASS CONSTRUCTOR
class Student{
Student(){
    System.out.println("hello from construcror");
}
Student(int x){
   this();
    System.out.println(x);}
}
public class TestThis2 {
    public static void main(String[] args) {
        Student s=new Student(10);
      // Student a=new Student();
        
    }
    
}
