/**
* Limitations of Arrays in C++
* No bound checking (overflow) or no array index checking.
* Array copying is not possible using the assignment statement.
* IN  JAVA IT IS POSSIBLE COPYING ARRAY USING ASSIGNMENT
*/

//for each loop is used to traverse array or collection in java
package tola.lemma.array_byfor_each_loop;

/**
 *
 * @author Tola Lemma
 */
import java.util.Scanner;
public class CopyingArray {
    
   
            
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
       double x=5d; 
       double y=1/(1+(1/x));
        System.out.println(y);
        int[] arry={1,2,3,4,5,6,7,8,9,10,12};
	int copyArray[];
	copyArray=arry;
	System.out.println(arry.length);//length of an array
	for(int i:copyArray)// i must initialized inside a for loop 
	{
		System.out.println(i);
	}
	//System.out.println(arry[6]);
	 
    }
    
}
