package Interface.Task1;

public class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopping");
    }
}
