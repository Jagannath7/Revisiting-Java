
class NotAnonymous{

    public void show(){
        System.out.println("I am not anonymous.");
    }

}



public class Anonymous {
    public static void main(String[] args) {

        NotAnonymous obj = new NotAnonymous()
                                {
                                    public void show(){
                                        // anonymous ->
                                        System.out.println("I am anonymous.");
                                    }
                                };
        obj.show();

    }
}
