package state.homework.state;

import state.homework.OneArmBandit;

public interface State {

    void insertTheCoin(OneArmBandit oneArmBandit);

    void pullTheLever(OneArmBandit oneArmBandit);

    void takeYourWinnings(OneArmBandit oneArmBandit);

    void currentStateOfGame(OneArmBandit oneArmBandit);
}
