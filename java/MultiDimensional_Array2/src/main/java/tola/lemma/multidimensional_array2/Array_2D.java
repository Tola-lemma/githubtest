/*
* A multidimensional array in which each row has 
*    a different number of columns can be created as follows.
*	int b[][];
*	b = new int[2][];
*	b[0] = new int[5];
*	b[1] = new int[3];
*.
 */
package tola.lemma.multidimensional_array2;

import java.awt.BorderLayout;

/**
 *
 * @author Tola Lemma
 */
public class Array_2D {
    public static void main(String[] args) {
        int x[][]=new int[4][];
        x[0]=new int[1];//1st Row ---1 element
        x[1]=new int[2];
        x[2]=new int[3];//3st Row ---3 element
        x[3]=new int[4];
        int i,j,k=0;
        for(i=0;i<4;i++)
            for(j=0;j<i+1;j++){
                x[i][j]=k;
                k++;
        }
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++)
           System.out.print(x[i][j] + "  ");
            System.out.println();
            
            }
        }
    }