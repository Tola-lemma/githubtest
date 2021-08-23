
package tola.lemma.static_block;

/**
* A multidimensional array in which each row has a different number of columns can be created as follows.
*	int b[][];
*	b = new int[2][];
*	b[0] = new int[5];
*	b[1] = new int[3];
*
*
* @author Tola Lemma
 */
 // static block
 //excuted at time of class loading before  main method
public class Array2D{
    /*
	static{
       System.out.println("Static block .");
    }*/
    public static void main(String[] args) {
		int twoD[][] =new int[4][];
			twoD[0] = new int[1];
			twoD[1] = new int[2];
			twoD[2] = new int[3];
			twoD[3]= new int[4];
			int i, j, k = 0;
			   for(i=0; i<4; i++)
				for(j=0; j<i+1; j++) {
					twoD[i][j] = k;
					k++; 
					}
			    for(i=0; i<4; i++) {
				for(j=0; j<i+1; j++)
				System.out.print(twoD[i][j] + " ");
				System.out.println();
    }
}
}
