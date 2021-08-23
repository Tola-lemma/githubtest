/**
 * 1 Set total to zero
 * 2 Set grade counter to one
 * 3
 * 4.While grade counter is less than or equal to ten
 * 5 Prompt the user to enter the next grade
 * 6 Input the next grade
 * 7 Add the grade into the total
 * 8 Add one to the grade counter
 * 9
 * 10 Set the class average to the total divided by ten
 * 11 Print the class average
 */
package tola.lemma.test1;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;

class AverageOfStudent {

    static Scanner input = new Scanner(System.in);

     void display() {
        float total = 0;
        int counter = 1;
        float grade;
        float average;
        // to second/*     
        System.out.println("Enter Grade's of Ten Student");
        while (counter <= 10) {
            System.out.println("Enter Grade of Student = " + counter);
            grade = input.nextFloat();
            if (grade < 0 || grade > 100) {
                System.out.println("You enter Invalid grade,please Enter Again");
            } else {
                total = total + grade;
                counter++;

            }
        }
        System.out.println("Sum Total of " + (counter - 1) + " Student is = " + total);
        average = total / 10;
        System.out.printf("The class Average is =  %f%n", average);

//*/
        /* System.out.println("Enter Student's Grade or -1 to quite");
        System.out.println("Enter Grade of Student = " + counter);
        grade = input.nextFloat();
        while (grade != -1) {
            if (grade < 0 || grade > 100) {
                System.out.println("You enter Invalid grade,please Enter Again");
            } else {
                total = total + grade;
                counter++;
            }
            System.out.println("Enter Student's Grade or -1 to quite");
            System.out.println("Enter Grade of Student = " + counter);
            grade = input.nextFloat();
        }
        if (counter != 0) {
            System.out.println("Sum Total of " + counter + " Student is = " + total);
            average = total / 10;
            System.out.printf("The class Average is =  %f%n", average);
        } else {
            System.out.println("no grade were ented");
        
         */
    }
}

public class TestG1 {

    public static void main(String[] args) {
       AverageOfStudent av = new AverageOfStudent();
        av.display();// but if method is static no need to istantiate direct invoked by class name.method
    }
}
