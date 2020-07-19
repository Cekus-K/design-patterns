package chainofresponsibility.lesson.message;

import chainofresponsibility.lesson.officer.OfficerRank;

public class Message {

    private String content;
    private int code;
    private OfficerRank rank;

    public Message(String content, int code, OfficerRank rank) {
        this.content = content;
        this.code = code;
        this.rank = rank;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getRank() {
        return rank;
    }
}
