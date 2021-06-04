
class NotAnonymous{

    public void show(){
        System.out.println("I am not anonymous.");
    }

}

interface Not_Anonymous{
    void show();
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
        Not_Anonymous obj1 = new Not_Anonymous() {
            @Override
            public void show() {
                System.out.println("I am also anonymous");
            }
        };

        obj.show();
        obj1.show();

    }
}
