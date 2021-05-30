

abstract class Human{

    // function has to be abstract if only declared.
   // if a function is abstract then the class has to be abstract.
    public abstract void eats();

    public void walks(){

    }

}

// concrete class
class Man extends Human{

    // mandatory to define
    public void eats(){}


}

public class AbstractClass {

    public static void main(String[] args) {

        // cannot instantiate an object of an abstract class
//        Human hmn = new Human();

         Human man = new Man();

    }

}
