public class Operators {

    /*
        1. Arithmetic -> +, -, *, /, %
        2. Bitwise
        3. Relational
        4. Logical
     */

    public static void main(String[] args) {

        int a = 6, b = 10;

        int x1 = a + b;
        int x2 = b - a;
        int x3 = a*b;
        int x4 = b/a;
        double x4_ = (double)b/a;
        int x5 = b%a;
        int x6 = a%b;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x4_);
        System.out.println(x5);
        System.out.println(x6);

        System.out.println(++a); // pre-increment
        System.out.println(a++); // post-increment
        System.out.println(a);



    }

}
