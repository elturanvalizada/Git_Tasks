package Interface.Task7;

public interface Printable {
    default void display(){
        System.out.println("Printing Content");
    }
}
