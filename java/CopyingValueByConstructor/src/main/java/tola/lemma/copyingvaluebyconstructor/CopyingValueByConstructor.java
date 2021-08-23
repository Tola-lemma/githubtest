/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.copyingvaluebyconstructor;

/**
 *
 * @author Tola Lemma
 */
public class CopyingValueByConstructor {

    int id;
    String name;

    CopyingValueByConstructor(int i, String n) {
        id = i;
        name = n;
    }

    /**
     *
     * @param s //copying value without Constructor
     * CopyingValueByConstructor(){}
     *
     */
    CopyingValueByConstructor(CopyingValueByConstructor s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("Copying Value using constructor\n " + id + " " + name);
    }

    public static void main(String[] args) {
        CopyingValueByConstructor cpy = new CopyingValueByConstructor(2825, "Tola Lemma");
        //CopyingValueByConstructor cpy2=new CopyingValueByConstructor();
        CopyingValueByConstructor cpy2 = new CopyingValueByConstructor(cpy);
        //cpy2.id=cpy.id;
        //cpy2.name=cpy.name;
        cpy.display();
        cpy2.display();
    }
}
