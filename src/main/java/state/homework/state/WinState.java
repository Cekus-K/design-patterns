package state.homework.state;

import state.homework.OneArmBandit;

class WinState implements State {

    @Override
    public void insertTheCoin(OneArmBandit oneArmBandit) {
        System.out.println("take your reward before playing again");
    }

    @Override
    public void pullTheLever(OneArmBandit oneArmBandit) {
        System.out.println("take your reward before playing again");
    }

    @Override
    public void takeYourWinnings(OneArmBandit oneArmBandit) {
        System.out.println("coins taken, congratulations");
        oneArmBandit.state = new NoCoinState();
    }

    @Override
    public void currentStateOfGame(OneArmBandit oneArmBandit) {
        System.out.println("current state: WIN");
    }
}
