
class A{
    public void show(){
        System.out.println("a");
    }
}

class B extends A{
    public void show(){
        System.out.println("b");
    }
}

class C extends A{
    public void show(){
        System.out.println("c");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        A obj = new B();
        obj.show(); // this method has to be present in both the classes.
    }

}
