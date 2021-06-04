import com.PackageDemo.PackageLoops;

public class Loops {

    public static void main(String[] args) {

        for(int i=0; i<=4; i++){
            System.out.println(i);
        }

        int i = 7;

//        while(i>0){
//            System.out.println(i);
//            i++;
//        }

        PackageLoops obj = new PackageLoops();
        obj.loops(10);


    }

}
