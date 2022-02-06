/**
Write a Java program that converts radians to degrees. The program must ask the user to enter a floatingpoint number (representing the angle in radians). The program must then convert the angle from radians
to degrees and output the result. The output must be formatted into degrees, minutes, and seconds (all of
these must be printed as integers, i.e., no decimal points).
Sample input: 2.0
Sample output: 114 degrees, 35 minutes, 29 seconds
Hint 1: degrees = (radians / Math.PI) * 180.0;
Hint 2: 114◦3502900 = 114 + 35 * (1/60) + 29 * (1/60)* (1/60) = 114:5913889◦
*/
import java.util.Scanner;
public class Radians2Degrees
{
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter an Angle in Radians: ");
double radians = scan.nextDouble();
// Calculate the degrees
double degrees = (radians/Math.PI) * 180.0;
int deg = (int) Math.floor(degrees);
// Calcualate the minutes
double minutes = 60.0 * (degrees - deg);
int min = (int) minutes;
// Calculate Seconds
double seconds = 60.0 * (minutes - min);
int sec = (int) seconds;
System.out.print(radians + " radians = ");
System.out.print(deg + " degrees, ");
System.out.print(min + " minutes, ");
System.out.print(sec + " seconds.\n");
}
}