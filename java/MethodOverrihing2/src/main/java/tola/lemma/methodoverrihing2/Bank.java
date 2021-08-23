/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.methodoverrihing2;
/**
 *
 * @author Tola Lemma
 */
public class Bank {
    int gateRateOfInterest() {
        return 0;
    }
}
//Creating Child class

class CBE extends Bank {

    @Override
    int gateRateOfInterest() {
        return 7;
    }
}

class ENAT extends Bank {

    @Override
    int gateRateOfInterest() {
        return 5;
    }
}

class NIB extends Bank {

    @Override
    int gateRateOfInterest() {
        return 6;
    }
}

class Test {

    public static void main(String[] args) {
        CBE obj = new CBE();//Bank obj =new CBE();also possible is so called Upcasting
        ENAT obj1 = new ENAT();
        NIB obj2 = new NIB();
        System.out.println("CBE Rate of interest is " +obj.gateRateOfInterest()+"%");
        System.out.println("ENAT Rate of interest is " +obj1.gateRateOfInterest()+"%");
        System.out.println("NIB Rate of interest is " + obj2.gateRateOfInterest()+"%");
    }
}
