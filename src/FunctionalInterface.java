
@java.lang.FunctionalInterface
interface demo{
    void print();
}


public class FunctionalInterface {

    public static void main(String[] args) {
        demo dm = () -> System.out.println("This is a functional interface.");
        dm.print();

    }

}
