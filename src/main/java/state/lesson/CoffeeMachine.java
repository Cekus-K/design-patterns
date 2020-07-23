package state.lesson;

import state.lesson.state.NoCoinState;
import state.lesson.state.State;

public class CoffeeMachine {

    public State state;

    CoffeeMachine() {
        state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    public void returnTheCoin() {
        state.returnTheCoin(this);
    }
}
