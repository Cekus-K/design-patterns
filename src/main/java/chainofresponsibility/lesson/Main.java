package chainofresponsibility.lesson;

import chainofresponsibility.lesson.message.Message;
import chainofresponsibility.lesson.officer.*;

class Main {

    public static void main(String[] args) {

        Message message1 = new Message("Attack!", 100, OfficerRank.GENERAL);
        Message message2 = new Message("Attack!", 20, OfficerRank.GENERAL);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        // return: General Zaborsky received message: Attack!
        sergeant.processMessage(message1);

        // return: Wrong recipient of the message or wrong encryption code!
        sergeant.processMessage(message2);
    }
}
