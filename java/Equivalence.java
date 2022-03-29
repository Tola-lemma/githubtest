/**
 *
 * @author Tola Lemma
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer x=new Integer(47);
        Integer y=new Integer(47);
        System.out.println(x==y);
		//System.out.println(Objects.equals(x, y)); this is when we --- import java.util.Objects;
		//System.out.println(x.equals(y));
        System.out.println(x!=y);
    }
}
//false
//true