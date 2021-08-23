/**
 *Phone Numbers (15p)
 * Write a complete Java program that asks the user to enter a 10 digit phone number. You can assume that
 * the user will always enter the ten digits without any spaces or punctuation signs (e.g., 5152945555). The
 * program must then format and print three different instances of this number: 1) full number with the area
 * code separated by ’(’ and ’)’ and a dash between the next three digits and the last four; 2) local number -
 * no area code but with a dash between the first three and the last four digits; 3) campus number - only the
 * last 5 digits with a dash after the first one.
 * Sample output:
 * Please Enter a 10 digit phone number: 5152945555
 * Full : (515) 294-5555
 * Local : 294-5555
 * Campus : 4-5555
 * package tola.lemma.project2;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;
public class PhoneNumb {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String x;
        System.out.println("Please Enter a 10 digit phone number: ");
        x=input.next();
        input.close();
        String a=x.substring(0,3);
        String b=x.substring(3, 6);
        String c=x.substring(6,10);
       // String d=b.substring(2, 3);
        char d=x.charAt(5);
        System.out.println("Full: "+ "("+a+")"+" "+b+"-"+c);
        System.out.println("Local: "+b+"-"+c);
        System.out.println("campus :"+d+"-"+c);
    }
    
}
