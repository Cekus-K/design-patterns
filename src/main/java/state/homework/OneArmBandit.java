package state.homework;

import state.homework.state.NoCoinState;
import state.homework.state.State;

public class OneArmBandit {

    public State state;

    OneArmBandit() {
        state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pullTheLever() {
        state.pullTheLever(this);
    }

    public void collectTheWinnings() {
        state.takeYourWinnings(this);
    }

    public void currentState() {
        state.currentStateOfGame(this);
    }
}
