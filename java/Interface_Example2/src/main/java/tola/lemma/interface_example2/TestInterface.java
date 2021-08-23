/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.interface_example2;

/**
 *
 * @author Tola Lemma
 */
// Interface Declaration: by first User
interface Drawable{
void draw();
}
//Implementation: By second user
class Rectangle implements Drawable{
@Override
//must be public
public void draw(){
    System.out.println("Drawing Rectangle .");
}
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing Circle .");
    }
}
//using Interface: by third user
class TestInterface {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
    }
}
