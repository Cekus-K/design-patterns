package command.homework.musicplayer;

import java.util.Arrays;
import java.util.List;

public class MusicPlayer {

    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack() {
        currentTrackNumber = 0;
        System.out.println("Playing first song: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber >= tracks.size()) {
            currentTrackNumber = 0;
        }
        System.out.println("Playing another song: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        currentTrackNumber = (int) (Math.random() * tracks.size());
        System.out.println("Playing random song: " + tracks.get(currentTrackNumber));
    }
}

