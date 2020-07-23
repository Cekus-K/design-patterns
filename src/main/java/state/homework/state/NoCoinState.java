package state.homework.state;

import state.homework.OneArmBandit;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(OneArmBandit oneArmBandit) {
        System.out.println("the coin has been tossed in");
        oneArmBandit.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(OneArmBandit oneArmBandit) {
        System.out.println("insert the coin to play");
    }

    @Override
    public void takeYourWinnings(OneArmBandit oneArmBandit) {
        System.out.println("pull the lever to test your luck");
    }

    @Override
    public void currentStateOfGame(OneArmBandit oneArmBandit) {
        System.out.println("current state: NO COIN");
    }


}
