
package tola.lemma.abstractclassexample1;

/**
 *
 * @author Tola Lemma
 */
abstract class Bike {

    abstract void run();
}
class Toyota extends Bike {

    @Override
    void run() {
        System.out.println("Run safely....");
    }

    public static void main(String[] args) {
        Bike obj = new Toyota();
        obj.run();
    }
}
