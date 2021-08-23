public class AboutStatic{
	 static int a=0;//A,Global variable
	 public static void main(String[] args){
		 int b=1;
		
	System.out.println(a);
		
/**
 * if "int a=0;" in position of "A" and we try to println like
 * "System.out.println(a); " can't display Err msg non-static variable a cannot
 * be referenced from a static context, but if put static keyword before int a
 * it works well like that of printing b also possible like below "AboutStatic
 * s=new AboutStatic();" "System.out.println(s.a);"
 *
 */
 double x=Math.sqrt(900.0);//Math.sqrt() returns double

 System.out.println(x);

	 }
}