/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.summer__0;

/**
 *
 * @author Tola lemma
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Summer_0 {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int msg(int x, int y) throws ArithmeticException {
        return x / y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;

        do {

            try {
                System.out.println("Enter the numbers");
                int a = input.nextInt();
                int b = input.nextInt();
                int outp = msg(a, b);
                System.out.println(outp);
                continueLoop = false;
            } catch (InputMismatchException yy) {
                System.out.println(yy);
                input.nextLine();
                System.out.println("please enter enteger not character ");

            } catch (ArithmeticException xo) {
                System.out.println(xo);
            }

        } while (continueLoop);
    }

}
