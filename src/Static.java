
class Employee{

    int eid;
    int salary;
    static String ceo;

    static {
        ceo = "jagannath";
    }

    public void show(){
        System.out.println(eid + salary + ceo);
    }

}


public class Static {

    public static void main(String[] args) {

        Employee me = new Employee();
        me.eid = 7;
        me.salary= 7000;
//        me.ceo = "me";

        Employee you = new Employee();
        you.eid = 8;
        you.salary = 3000;

//        me.ceo = "jagannath";
//        Employee.ceo = "me"; // static keywords can be called with the class.

        me.show();
        you.show();

    }


}
