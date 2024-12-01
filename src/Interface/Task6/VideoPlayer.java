package Interface.Task6;

public class VideoPlayer implements Playable {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.defaultPlayMessage();
    }
    @Override
    public void defaultPlayMessage() {
        System.out.println("Playing Video");
    }
}
