/**
 * Write a complete Java program that generates a random 16-digit credit card number for a Discover card.
 * The first 6 digits of each credit card number are reserved for the issuer number. For Discover cards these
 * digits must be “6011xx”. The remaining ten digits are the account number. Print the credit card number
 * using the standard format: 6011-xxxx-xxxx-xxxx.
 * Hint: Use the Random class to generate the missing two digits of the issuer number and the ten digits of
 * the account number. You can generate them one at a time.
 */
package tola.lemma.project;

import java.util.Locale;
import java.util.Random;
/**
 *
 * @author Tola Lemma
 */

public class Credit_Card_Number_Generator {
    
    public static void main(String[] args) {
        Random rand = new Random();
String yourValue = String.format((Locale)null, //don't want any thousand separators
                        "6011-%04d-%04d-%04d",
                        //rand.nextInt(100),
                        rand.nextInt(10000),
                        rand.nextInt(10000),
                        rand.nextInt(10000));
        System.out.println(yourValue);
    }
}
