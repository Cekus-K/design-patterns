package chainofresponsibility.lesson.officer;

import chainofresponsibility.lesson.message.Message;

public class General extends Officer {

    private static final int CODE = 100;
    private static final String NAME = "General Zaborsky";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(OfficerRank.GENERAL)
                && message.getCode() == CODE) {
            System.out.println(NAME + " received message: " + message.getContent());
        } else {
            System.err.println("Wrong recipient of the message or wrong encryption code!");
        }
    }
}
