
class Calc{

    int num1, num2, result;

    public void perform(){
        result = num1 + num2;
    }

    public Calc(){
    }

    public Calc(int num1, int num2){
        result = num1 * num2;
    }

}

public class Classes {

    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.num1 = 3;
        obj.num2 = 4;
        obj.perform();
        System.out.println(obj.result);


        Calc obj2 = new Calc(3, 4);
        System.out.println(obj2.result);

    }

}
