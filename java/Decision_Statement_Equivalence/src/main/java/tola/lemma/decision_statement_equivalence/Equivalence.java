/*
 * the special method equals( ) 
 * is used to compare the contents of the objects
 */
package tola.lemma.decision_statement_equivalence;

/**
 * @author Tola Lemma
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer x=new Integer(47);
        Integer y=new Integer(47);
        System.out.println(x==y);//false
        //System.out.println(Objects.equals(x, y));
        // is true but this works  is when we --- import java.util.Objects;
        System.out.println(x.equals(y));//is true
        System.out.println(x!=y);
    }
}
