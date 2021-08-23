package tola.lemma.stringtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tola lemma
 */
public class stringExample {
    //import java.lang.String;

public static void main(String[] args)
{
   
String hisName = "john smith";
hisName.concat("Adam Smith");
System.out.println(hisName);
int l=hisName.length();
System.out.println(l);
String t="   Hello trimming     ".trim();
//Returns a copy of the string, with leading and trailing whitespace omitted.
System.out.println(t);
String lc=t +" JAVA PROGRAMMING".toLowerCase();
System.out.println(lc);//Hello trimming java programming
//String lc=(t +" JAVA PROGRAMMING").toLowerCase();//hello trimming java programming
String sub=lc.substring(6);// (pass a primitive) method call that require argumment to be passed
System.out.println(sub);//trimming java programming

boolean b=lc.endsWith("programming");//Tests if this string ends with the specified suffix.
//(pass an object) method require String reference to be passed
System.out.println(b);//true
char c=lc.charAt(10);//Returns the char value at the specified(example here at 10) index.
System.out.println(c);//m
boolean start=lc.startsWith("Hello");
//Tests if the substring of this string beginning at the specified index starts with the specified prefix
System.out.println(start);//true

/*System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!");
f means formatted, format string →%s, %→format specifiers.*/


/*
✓ OUTPUT IS john smith , because String objects are immutable/unmodified/unchangeable
✓ john smith is not changed but a new object is created with john smithAdam smith in string constant pool.
✓ that is why String is known as immutable/unmodified/unchangeable.
✓ but if we assign Explicitly like hisName=hisName.concat("Adam Smith");// out put is john smithAdam smith 

*/
}

    
}
