/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.test_tade;

/**
 *
 *
 * @author Tola lemma
 */
class Iphone
{
    //should be public
    public void display(){
        System.out.println("I phone sumsung A21 is upcaming");
    }
}
class Tecno{
public void display(){
    System.out.println("Techno k7 is outdated");
}


public class TestTade1 {
    public static void main(String[] args) {
        Iphone i=new Iphone();
        Tecno m=new Tecno();
        show(i);
        showing(m);
        
    }
    public static void show(Iphone i) {
        i.display();
    }
    public static void showing(Tecno m) {
        m.display();
    }
}
}


