// overloading
public class OverLoad{
	
	void test(){
		System.out.println("no argument");
	}
	void test(int a){
		System.out.println("a= "+a);
	}
	void test(int a,int b){
		System.out.println("a="+a +"b= "+b);
	}
	double test(double a){
		System.out.println("double a= "+a);
		return a*a;
	}
}
class TestClass{
public static void main(String[] args){
	
	double result;
	OverLoad ov=new OverLoad();
ov.test();
ov.test(2);
ov.test(2,3);
result=ov.test(2.5);
System.out.println("Value odf double of test metho");

}
}