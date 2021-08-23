/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.iheritance1;

/**
 *File:Employee.java
 * @author Tola Lemma
 */
 // EXAMPLE OF INHERITANCE 
public class Employee {
    float salary=40000;
}
class Programmer extends Employee{
int bonus=10000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("Programmer salary is  "+p.salary);
        System.out.println("Programmers Bonus is "+ p.bonus);
    }
}