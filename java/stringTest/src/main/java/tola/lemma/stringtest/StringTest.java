
package tola.lemma.stringtest;

/**
 *
 * @author Tola Lemma
 */
         //SubStringCons 
public class StringTest {
    // Construct string from subset of char array.

	public static void main(String args[]) {
		byte ascii[] = {65, 66, 67, 68, 69, 70 };
		String s1 = new String(ascii);
		System.out.println(s1);
		String s2 = new String(ascii, 2, 3);
		System.out.println(s2);
	} 
}
