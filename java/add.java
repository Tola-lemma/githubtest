import java.util.Scanner;
public class add
{
	
public static void main(String[] args){
	 int a,b,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
z=addition(a,b);
System.out.println("The addition of the two  number is :" +z);

}

static int addition(int x,int y){
	return x+y;
}
}