package command.homework.musicplayer.command;

import command.homework.musicplayer.MusicPlayer;

public class PlayRandomTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayRandomTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
