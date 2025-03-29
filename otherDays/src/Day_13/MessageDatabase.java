package Day_13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }
    private MessageDatabase() {
    }
    public static List<Message> getMessages() {
        return messages;
    }
    public static void showDialog(User u1, User u2) {
        for (Message a: messages) {
            if ((a.getSender().equals(u1) && a.getReceiver().equals(u2)) || (a.getSender().equals(u2) && a.getReceiver().equals(u1))) {
                System.out.println(a.getSender() + ": " + a.getMessage());
            }
        }
    }

}
