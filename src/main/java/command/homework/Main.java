package command.homework;

import command.homework.musicplayer.*;
import command.homework.musicplayer.command.PlayFirstTrackCommand;
import command.homework.musicplayer.command.PlayNextTrackCommand;
import command.homework.musicplayer.command.PlayRandomTrackCommand;

public class Main {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
