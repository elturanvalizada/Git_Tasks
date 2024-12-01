package Interface.Task7;

public interface Readable {

    default void display(){
        System.out.println("Displaying Content");
    }
}
