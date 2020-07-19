package chainofresponsibility.lesson.officer;

import chainofresponsibility.lesson.message.Message;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sergeant Kovalsky";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(OfficerRank.SERGEANT)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
