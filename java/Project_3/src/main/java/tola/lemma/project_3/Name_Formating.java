/**
 *Write a Java program that asks the user to enter his three names on a single line.
 * You can assume that the user will always enter his/her names in the following format:
 * \First Middle Last". In other words, the first
character typed in will be the first letter of the first name; the names will be separated with a single space;
the last character typed in will be the last character of the last name; and finally all names will have only
their first letter capitalized. The program must then format and print the name in the following format:
\LAST, First M." In other words, the last name must be printed first with all capital letters, followed by a
comma, followed by the full first name as it was typed in, followed by the first letter of the middle name,
followed by a period.
Hint: Use the methods of the String class to find the positions of the separators in the original string. Then
chop that string into three separate pieces and print them in the desired order and format

*/
/**
 *
 * @author hp
 */
package tola.lemma.project_3;
import java.util.Scanner;
public class Name_Formating {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name ");
        String allName=input.nextLine();
        int fIndex=allName.indexOf(' ');
        String fName=allName.substring(0,fIndex);
        int sIndex=allName.indexOf(' ',fIndex+1);
        String sName=allName.substring(fIndex+1,sIndex);
        String tName=allName.substring(sIndex+1,allName.length());
                 System.out.println("Formated Name is: ");
                  System.out.print(tName.toUpperCase());
                   System.out.print(", ");
                    System.out.print(fName); 
                     System.out.print(" ");
                    System.out.print(sName.charAt(0));
                     System.out.print(".");
                    
    }
    
}
