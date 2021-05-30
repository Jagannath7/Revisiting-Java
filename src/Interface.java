
interface Writer{

    // all methods in an interface are public and abstract by default.
    //public abstract write();
    void write();

}

class Pen implements Writer{

   public void write(){
       System.out.println("Writing with a pen");
   }

}

class Pencil implements Writer{

    public void write() {

        System.out.println("Writing with a pencil");

    }
}

class Writing{

    public void writingWith(Writer writer){
        writer.write();
    }

}

public class Interface {

    public static void main(String[] args) {

//        Pen pen = new Pen();
//        Pencil pencil = new Pencil();
//        Writing w = new Writing();
//        w.writingWith(pencil);

        // Can only create reference of an interface not objects.
         Writer writerPen = new Pen();
         Writer writerPencil = new Pencil();

         Writing writing = new Writing();

         writing.writingWith(writerPen);

         writing.writingWith(writerPencil);

    }

}
