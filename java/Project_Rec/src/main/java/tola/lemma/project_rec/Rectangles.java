/**
 *Write a complete Java program which asks the user to enter the coordinates of the lower left and the upper
 * right corners of a rectangle. In other words, the program must read two pairs of floating point numbers
 * which represent the x and y coordinates of two points: PLL = (x1; y1) and PUR = (x2; y2). The program
 * must then calculate and print on the screen the following four values associated with the rectangle: 1) the
 * length of the horizontal side; 2) the length of the vertical side; 3) the perimeter; 4) the area.
 * public class Rectangles
 */
package tola.lemma.project_rec;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;

public class Rectangles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please Enter the left side horozontal side x1 ");
        double x1 = input.nextDouble();
        System.out.println("please Enter the left side horozontal side x2");
        double x2 = input.nextDouble();
        System.out.println("please Enter the left side verical side y1");
        double y1 = input.nextDouble();
        System.out.println("please Enter the left side vertical side y2");
        double y2 = input.nextDouble();
        double lv = Math.abs(y2 - y1);
        System.out.println("length of the vertical side is " + lv);
        double lh = Math.abs(x2 - x1);
        System.out.println("length of the horizontal side is " + lh);
        double area = lv * lh;
        System.out.println("area of rectangle is " + area);
        double perim = 2.0 * lv + 2.0 * lh;
        System.out.println("perimeter of rectangle is " + perim);
    }

}
