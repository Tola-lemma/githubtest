
package tola.lemma.staticmethod_exaple;

/**
 * file name : ¥_Cube.java
 * @author Tola Lemma
 * any currency symbol can be used as identifier 
 * //$ € £ ¥ ₨ ₵
 */
//Static method need not to be intantiated while  invoking
public class ¥_Cube {
    static int cubex(int x){
    return (x*x*x);
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       int result=¥_Cube.cubex(5);
        System.out.println(result);
		System.out.println(Math.sin(90));
				System.out.println(Math.sqrt(9));
    }
}
