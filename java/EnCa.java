//class is known as Read only class if there is only getter method
public class EnCa {
private String name="AAU";
public void setName(String name)
{
	this.name=name;
}
public String getName(){
	return name;
}
public static void main(String[] args) {
	EnCa obj=new EnCa();
	obj.setName("CNCS");//
	System.out.println(obj.getName());
} 
}