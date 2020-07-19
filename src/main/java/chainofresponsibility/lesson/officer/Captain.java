package chainofresponsibility.lesson.officer;

import chainofresponsibility.lesson.message.Message;

public class Captain extends Officer {

    private static final int CODE = 50;
    private static final String NAME = "Captain Rococowsky";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(OfficerRank.CAPTAIN)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
