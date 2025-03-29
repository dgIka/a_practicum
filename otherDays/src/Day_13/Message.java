package Day_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String message;
    private Date date;
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");

    public Message(User sender, User receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + this.getSender() + "\nTO: " + this.getReceiver() + "\nON: " + sdf.format(this.getDate()) + "\n" + this.getMessage();
    }
}
