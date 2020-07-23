package state.homework;

class Main {

    public static void main(String[] args) {

        OneArmBandit oneArmBandit = new OneArmBandit();

        oneArmBandit.insertTheCoin();
        oneArmBandit.currentState();
        oneArmBandit.pullTheLever();
        oneArmBandit.currentState();
        oneArmBandit.collectTheWinnings();
        oneArmBandit.currentState();
    }
}
