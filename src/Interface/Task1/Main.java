package Interface.Task1;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer =  new VideoPlayer();

        musicPlayer.play();
        musicPlayer.stop();
        System.out.println();
        videoPlayer.play();
        videoPlayer.stop();
    }
}
