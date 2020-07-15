package singleton.lesson;

import java.io.Serializable;

class GameEngine implements Serializable {

    public static final long serialVersionUID = 23232323;

    private int hp = 100;
    private String characterName = "Hero";

    // initialization will be performed when the class is loaded
    // into the classloader and protects against multi-threading
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public static GameEngine getInstance() {
        return instance;
    }

    public void run() {
        while (true) {
            //waiting for gamer input
            //changing state of game
            //rendering graphics
        }
    }

    // protects against serializing multiple copies of a class instance
    protected Object readResolve() {
        return getInstance();
    }
}
