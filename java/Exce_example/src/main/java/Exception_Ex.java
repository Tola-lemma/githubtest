
import java.util.Scanner;

class VoteException extends Exception {

    VoteException(String m) {
        super(m);
    }
}

public class Exception_Ex {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enetr your age ");
            int age = input.nextInt();
            check(age);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }

    }

    static void check(int age) throws Exception {
        if (age < 18) {
            throw new VoteException("your age must be grater than 18");
        }

        System.out.println("welcome to vote ");
    }

}
