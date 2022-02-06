/*
Write a complete Java program that reads in an integer number and output its digits in reverse order but
in English. For example, if the input was 608 then the output should be "Eight Zero Six". You can assume
that the user will be nice and will always input an integer.
 */
package tola.lemma.project_4;

import java.util.Scanner;

/**
 *
 * @author Tola Lemma
 */
public class NumberToText {
    public static void main(String[] args)
{
int number, digit;
Scanner scan= new Scanner(System.in);
System.out.print("Enter an Integer Number: ");
number = scan.nextInt();
do
{
digit = number % 10;
number = number / 10;
switch(digit)
{
case 0 -> System.out.print("Zero ");
case 1 -> System.out.print("One ");
case 2 -> System.out.print("Two ");
case 3 -> System.out.print("Three");
case 4 -> System.out.print("Four ");
case 5 -> System.out.print("Five ");
case 6 -> System.out.print("Six ");
case 7 -> System.out.print("Seven ");
case 8 -> System.out.print("Eight ");
case 9 -> System.out.print("Nine ");
}
} while (number > 0);
System.out.println();
}
    
}
