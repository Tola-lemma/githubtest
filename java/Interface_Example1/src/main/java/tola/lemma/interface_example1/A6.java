/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.interface_example1;

/**
 *
 * @author Tola Lemma
 */
interface printable{
    void print();
   

}
class A6 implements printable {
    @Override
    public void print(){
        System.out.println("Hello interface.");
    }
    public static void main(String[] args) {
        A6 obj=new A6();
        obj.print();
    }
}
