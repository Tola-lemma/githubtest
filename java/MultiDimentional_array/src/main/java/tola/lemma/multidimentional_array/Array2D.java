package tola.lemma.multidimentional_array;

/**
 *
 * @author Tola Lemma
 */
public class Array2D {

    public static void main(String[] args) {

        int x[][] = {{0}, {1, 2}, {3, 4, 6}, {7, 8, 9, 10}, {1, 2, 7, 10, 11}};
        for (int[] i : x) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
