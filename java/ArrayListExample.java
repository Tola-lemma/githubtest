import java.util.ArrayList;
public class ArrayListExample{
	public static void main(String[] args){
	ArrayList myList;//declaring a reference	
    myList=new ArrayList();//instantiation of the ArrayList
	myList.add("john");// initialize arraylist
    myList.add("Tola ");
	myList.add("Tade");
	myList.add("Marry");
	myList.add("Tsehay");
	myList.add("Meseret");
	myList.add("Tefera");
	myList.add("Tarefu");
	  	myList.remove(0);//modifing the ArrayList----removing the first elements of en ArrayListss
		myList.remove(myList.size()-1);//remove last element of an arraylist
		myList.remove("Tsehay");//Remove Specific element 
		System.out.println(myList);
	}
	
}



//[Tola , Tade, Marry, Meseret, Tefera]