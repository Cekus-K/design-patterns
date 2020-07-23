package state.homework.state;

import state.homework.OneArmBandit;

import java.util.Random;

class CoinInsertedState implements State {

    static final private Random random = new Random();

    @Override
    public void insertTheCoin(OneArmBandit oneArmBandit) {
        System.out.println("the coin has already been tossed in");
    }

    @Override
    public void pullTheLever(OneArmBandit oneArmBandit) {
        System.out.println("the draw is in progress ...");
        int result = random.nextInt(99);
        if (result < 20) {
            System.out.println("Win! Claim your reward");
            oneArmBandit.state = new WinState();
        } else {
            System.out.println("Defeat. Maybe next time it will work?");
            oneArmBandit.state = new NoCoinState();
        }
    }

    @Override
    public void takeYourWinnings(OneArmBandit oneArmBandit) {
        System.out.println("pull the lever to test your luck");
    }

    @Override
    public void currentStateOfGame(OneArmBandit oneArmBandit) {
        System.out.println("current state: COIN INSERTED");
    }
}
