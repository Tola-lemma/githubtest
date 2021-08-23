/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.multilevelinheritance;

/**
 *
 * @author Tola Lemma
 */
class Animal {

    void animal() {
        System.out.println("Animal Class Which is superClass");
    }
}

class Dog extends Animal {

    void dog() {
        System.out.println("Dog class which is extended also called child or derived class");
    }
}

class BabyDog extends Dog {

    void babyDog() {
        System.out.println("class extended from Dog class it is child class for Dog class");
    }
}

public class TestInheritance2 {

    public static void main(String[] args) {
        BabyDog baby = new BabyDog();
        baby.animal();
        baby.dog();
        baby.babyDog();
    }

}
