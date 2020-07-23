package state.lesson;

class Main {

    // the state pattern makes it possible to make the object's behavior dependent on the state in which it is
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
    }
}
