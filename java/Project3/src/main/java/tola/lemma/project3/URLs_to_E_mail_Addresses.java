/**
 *Write a program that asks the user to enter a web link (URL) to
 * a person’s web site and uses that link to
 * guess the person’s e-mail address. For example, if the user entered “http://www.cs.iastate.edu/˜john” the
 * program should output “john@cs.iastate.edu”. You can assume that the user will always enter the URL in
 * the following format: the first character typed in will be the first letter of the URL; the URL always starts
 * with “http://www.”; there is only one ’˜’ in the URL’s name; the last character typed in will be the last
 * character of the URL; finally, there will be no spaces in the URL’s name. The program must then format
 * and print the e-mail address on the screen. The “www” in the URL must be omitted from the e-mail address
 * as in the example given above.
 * Hint: Use the methods of the String class to find the positions of the separators in the original string. Then
 * chop that string into separate pieces and print them in the desired order and format.
 */
package tola.lemma.project3;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;
public class URLs_to_E_mail_Addresses {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String url;
        System.out.println("enter a web link (URL)");
        url=input.next();
        input.close();
        String abc=url.substring(11);
	int x=abc.indexOf("/");
	String n=abc.substring((x+1));
	String cc=abc.substring(0,x);
	String nn=n.concat("@"+cc);
	System.out.println(nn);
        
    }
}
