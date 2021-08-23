/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.inheritance_superkeyword2;

/**
 *
 * @author Tola Lemma
 */
class Person{
int id;
String name;
Person(int id,String name){
this.id=id;
this.name=name;

}
}
class Boy extends Person{
float salary;
Boy(int id,String name,float salary){
super(id,name);// reusing constructor
this.salary=salary;
}
void display(){
    System.out.println(id +" "+name+" "+salary);
}
}
public class SuperTest {
    public static void main(String[] args) {
        Boy obj=new Boy(2825,"Tola Lemma",300f);
        obj.display();
    }
    
}
