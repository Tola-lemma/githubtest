//JAVA OPERATOR
          /**
             *@Tola Lemma
                  *version 1.9
                   *enjoy coding
                */
class operator{
public static void main(String[] args)
{
        int x=20;
     System.out.println("****************UNARY OPERATOR 1 ++ & --***********");
System.out.println(x++);// 20(21)	
System.out.println(++x);// 22 	
System.out.println(x--);// 22(21)
System.out.println(--x);// 20
     System.out.println("****************UNARY OPERATOR 2 ++ & --***********");
System.out.println(x++ + ++x);// 20+22=42;
System.out.println(x++ + x++);// 22+23=45;
System.out.println(++x + x++);// 25+25=50;
//System.out.println(x++);//  26; // if this comment removed ~x become 28 why?
System.out.println("************ UNARY OPERATOR ~ & ! *****************");
        int y=-20;
        boolean a=true;
        boolean b=false;
System.out.println(~x);// -27 (minus of total positive value which starts from 0)
System.out.println(~y);// 19 (positive of total minus positive starts from 0)
System.out.println(!a);// false
System.out.println(!b);// true
System.out.println(x+y);// 6
            //JAVA LEFT SHIFT OPERATOR
     System.out.println("*************LEFT SHIFT OPERATOR*****************");
System.out.println(10<<2);// 10*2^2=10*4=40
System.out.println(10<<3);// 10*2^3=10*8=80
System.out.println(20<<2);// 20*2^2=20*4=80
System.out.println(15<<4);// 15*2^4=15*16=240
             //JAVA RIGHT SHIFT OPERATOR
     System.out.println("************RIGHT SHIFT OPERATOR****************");
System.out.println(10>>2);// 10/2^2=10/4=2
System.out.println(20>>2);// 20/2^2=20/4=5
System.out.println(20>>3);// 20/2^3=20/8=2
     System.out.println("************  >> VS >>> OPERATOR****************");
	        // for negative >> and >>> works the same
System.out.println(20>>2);// 20/2^2=20/4=5
System.out.println(20>>>2);// 20/2^2=20/4=5
             // for Negative number >>> changes parity bit(MSB) to 0
System.out.println(-20>>2);// -20/2^2=20/4=-5	
System.out.println(-20>>>2);//    1073741819
}
}// putting ; here is optional