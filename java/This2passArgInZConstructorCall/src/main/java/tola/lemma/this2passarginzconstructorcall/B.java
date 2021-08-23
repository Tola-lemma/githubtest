/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.this2passarginzconstructorcall;

/**
 *
 * @author Tola Lemma
 */
public class B {
    
    A4 obj;
    B(A4 obj){
    this.obj=obj;
    }
    void display(){
    System.out.println(obj.data);
    }
}
class A4{
int data=10;
A4(){
B b=new B(this);
        b.display();
}
    public static void main(String[] args) {
        A4 a=new A4();
        //System.out.println(a); display A4@blablabla adress
    }
}