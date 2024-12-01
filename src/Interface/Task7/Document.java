package Interface.Task7;

public class Document implements Printable, Readable{
    @Override
    public void display() {
        System.out.println("Implemented Document");
    }

//    @Override
//    public void display() {
//        Readable.super.display();
//    }


}
