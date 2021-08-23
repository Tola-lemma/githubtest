package tola.lemma.sorting_string;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Tola Lemma
 */
public class SortString {

    static String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "persons", "to", "come", "to", "the", "aid", "of", "their", "country"};

    public static void main(String args[]) {
        Arrays.sort(arr);
        System.out.println("sorted array is Ascending order :" + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("sorted array is Descending order :" + Arrays.toString(arr));
//	for(int j = 0; j < arr.length; j++) {
//		for(int i = j + 1; i < arr.length; i++) {
//			if(arr[i].compareTo(arr[j]) < 0) {
//				String t = arr[j];
//				arr[j] = arr[i];
//				arr[i] = t;
//			}
//		}
//System.out.println(arr[j]);
//}
}
    
}
