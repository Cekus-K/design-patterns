package singleton.homework;

class Main {
    public static void main(String[] args) {
        GuessGame guessGame = GuessGame.getInstance();
        GuessGame guessGame2 = GuessGame.getInstance();

        guessGame.play();

        int score = guessGame.getScore();

        if (guessGame == guessGame2) {
            System.out.println("Singleton!");
        }

        if (score == guessGame2.getScore()) {
            System.out.println("And the score is the same!");
        }
    }
}
