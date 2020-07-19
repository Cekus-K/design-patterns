package command.homework.musicplayer.command;

import command.homework.musicplayer.MusicPlayer;

public class PlayFirstTrackCommand implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayFirstTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
