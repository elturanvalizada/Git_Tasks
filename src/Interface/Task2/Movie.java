package Interface.Task2;

public class Movie implements AdvancedPlayable{
    @Override
    public void pause() {
        System.out.println("Movie is pausing");
    }

    @Override
    public void play() {
        System.out.println("Movie is playing");
    }

    @Override
    public void stop() {
        System.out.println("Movie is stopping");
    }
}
