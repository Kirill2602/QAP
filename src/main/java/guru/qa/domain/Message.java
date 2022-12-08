package guru.qa.domain;

import java.util.Date;

public class Message {
    private final String test;
    private final int from;
    private final int to;
    private final Date creationDate;

    public String getTest() {
        return test;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Message(String test, int from, int to, Date creationDate) {
        this.test = test;
        this.from = from;
        this.to = to;
        this.creationDate = creationDate;
    }
}
