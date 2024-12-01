package Interface.Task6;

public interface Playable {

    default void defaultPlayMessage(){
        System.out.println("Playing Media");
    }
}
