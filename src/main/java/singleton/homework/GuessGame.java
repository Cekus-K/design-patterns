package singleton.homework;

import java.util.Random;
import java.util.Scanner;

class GuessGame {
    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();


    private GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            int randomNumber = random.nextInt(10);
            if (randomNumber == scanner.nextInt()) {
                System.out.println("You scored a point!");
                score++;
            } else {
                System.out.println("You missed, the number is: " + randomNumber);
            }
        }
        System.out.println("Your score is: " + score);
    }
}
