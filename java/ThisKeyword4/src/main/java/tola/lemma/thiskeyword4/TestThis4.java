/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.thiskeyword4;

/**
 *
 * @author Tola Lemma
 */
// call to this(); must be the first statement in constructor
//PASS ARGUMENT IN CONSTRUCTOR CALL
class A{
int x;
String name;
float fee;
A(int x,String name){
this.x=x;
this.name=name;
}
A(int x,String name ,float fee){
    this(x,name);// this statement must be the first in constructor call
    this.fee=fee;
}
void display(){
    System.out.println(x+ " "+ name + " " + fee);
}
}
public class TestThis4 {
    public static void main(String[] args) {
         A a=new A(20,"Tade");
        A b=new A(20,"yeabisera",1000f);
        a.display();
        b.display();
    }
    
}
