/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.constructorwiththiskeyword;

/**
 *
 * @author Tola Lemma
 */
public class ConstructorThis {
    int num1;
    int num2;
    // Parameterized constructor 
    ConstructorThis(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // method
//    public String toString(){
//    return "Number 1 = " + num1 + "\nNumber 2 = " + num2;
//    }
    
    void show() {
        //Displaying value of variables a and b 
        System.out.println("Method Number 1 = " + num1 + "\nNumber 2 = " + num2);
    }

    public static void main(String[] args) {
        // creating class object
        ConstructorThis obj = new ConstructorThis(12, 10);
        obj.show();
       // System.out.println(obj);// to display hashcode
       // System.out.println(obj.toString());
    }
} 
    

