
package tola.lemma.Static_Instance_initializer_Block;

/**
 *
 * @author Tola Lemma
 */
class Test_Initializer_Block {

    int speed;

    Test_Initializer_Block() {
	
        System.out.println("constructor is invoked.");
    }

 {
        System.out.println("Instance initializer block invoked");
    }

    public static void main(String[] args) {
        Test_Initializer_Block b1 = new Test_Initializer_Block();
        Test_Initializer_Block b2 = new Test_Initializer_Block();
    }
}

/* output
Instance initializer block invoked
constructor is invoked.
Instance initializer block invoked
constructor is invoked.
*/
//instance initializer is invoked at the time of object creation . and after super();construcor call