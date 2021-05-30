public class WrapperClass {

    public static void main(String[] args) {

        // primitive data type
        int i = 5;

        // Wrapper Class
        // boxing or wrapping
        Integer i1 = new Integer(i); // class object

        int i2 = i1.intValue(); // unboxing


        Integer i3 = i; // auto boxing

        int i4 = i3; // auto unboxing

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);


    }


}
