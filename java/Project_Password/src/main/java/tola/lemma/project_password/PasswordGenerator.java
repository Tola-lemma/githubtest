/**
 *Write a complete Java program that generates a random password for a computer account. The password
must have a length of exactly 5 characters. The first and the fourth characters must be capital letters from
the English alphabet (A-Z). The second and the fifth characters must be numbers (0-9). The third character
must be a dash (i.e., ’-’). Here are two examples of valid passwords: \R2-D2" and \C3-P0".
Hint: The only difficult part in this program should be figuring out how to print a single character (without
printing a new line). To do this you can use the following snippet of code where num is defined as an int:
System.out.printf("%c", ’A’ + num);
For example, if num=3 the result should be D; if num=0 the result should be A.
 */
package tola.lemma.project_password;

/**
 *
 * @author Tola Lemma
 */
import java.util.Random;
public class PasswordGenerator {
    public static void main (String[] args)
{
Random rand = new Random();
// Get the two letters (1st and 4-th caracters)
int firstChar = rand.nextInt(26); // 0 to 25
int fourthChar = rand.nextInt(26); // 0 to 25
// Get the two numbers (2nd and 5-th caracters)
int secondChar = rand.nextInt(10); // 0 to 9
int fifthChar = rand.nextInt(10); // 0 to 9
// Print the password
System.out.print("Your password is: [");
System.out.printf("%c",'A'+firstChar);
System.out.print(secondChar);
System.out.print("-");
System.out.printf("%c",'A'+fourthChar);
System.out.print(fifthChar);
System.out.print("]\n");
}
    
}
