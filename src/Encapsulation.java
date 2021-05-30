class Student{

    private int roll;
    private String name;

    // Getters and Setters

    public void setRoll(int r){
        roll = r;
    }

    public int getRoll(){
        return roll;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRoll(1);
        s1.setName("John Doe");
        System.out.print(s1.getRoll());
        System.out.print(" : ");
        System.out.print(s1.getName());

    }

}
