package Interface.Task1;

public class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopping");
    }
}
