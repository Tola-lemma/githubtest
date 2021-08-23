/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tola.lemma.arrayliste;

/**
 *
 * @author Tola Lemma
 */
import java.util.ArrayList;
public class ArrayListExample {
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
                myList.remove(0);//modifing the ArrayList
		myList.remove(myList.size()-1);
		myList.remove("Tsehay");
		System.out.println(myList);
	}
	

    
}
