package singleton.lesson;

import java.io.Serializable;

// using the enum type instead of the class protects against
// reflection and, for example, changing the constructor access specifier to public
public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName;

    private static GameEngineEnum instance;

    private GameEngineEnum(String characterName) {
        this.characterName = characterName;
    }

    public void run() {
        while (true) {
            //waiting for gamer input
            //changing state of game
            //rendering graphics
        }
    }
}
