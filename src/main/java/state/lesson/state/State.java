package state.lesson.state;

import state.lesson.CoffeeMachine;

public interface State {

    void insertTheCoin(CoffeeMachine coffeeMachine);

    void pushTheButton(CoffeeMachine coffeeMachine);

    void takeTheCup(CoffeeMachine coffeeMachine);

    void returnTheCoin(CoffeeMachine coffeeMachine);
}
