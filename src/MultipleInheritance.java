
interface Interface1{

    default void print(){
        System.out.println("In interface 1.");
    }
}

interface Interface2{

    default void print(){
        System.out.println("In interface 2");
    }
}

class Demo implements Interface1, Interface2{

    public void demo(){
        System.out.println("In demo");
    }

    @Override
    public void print() {
        Interface2.super.print();
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        Demo dm = new Demo();
        dm.print();
    }

}
