
public class Problem4
{
public static int mystery(int a, int b)
{
int m=(a+b)/2;
return m;
}
public static void main(String[] args)
{
	String url="http://www.aau.edu.et/tola";
	String abc=url.substring(11);
	System.out.println(abc);
	int x=abc.indexOf("/");
	String n=abc.substring((x+1));
	String cc=abc.substring(0,x);
	System.out.println(cc);
	
	//System.out.println(n);
	String nn=n.concat("@"+cc);
	System.out.println(nn);
    //int nnn=nn.indexOf("/");
	//System.out.println(nnn);
	//String n3=nn.substring(0,(nnn));
	//System.out.println(n3);
	
	
	
	int a = 1;
int b = 5;
int m =6;
m = mystery(a,b);
//System.out.println(m);//3
b = mystery(a,m-1);
//System.out.println(b);//1
a = mystery(m+1, b);
//System.out.println(a);//2
}
}
