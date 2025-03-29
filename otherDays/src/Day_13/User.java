package Day_13;

import java.util.ArrayList;
import java.util.List;

public class User{
    private String username;
    private List<User> subscriptions;
    private List<User> friendList;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        this.friendList = new ArrayList<>();
    }
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed (User user) {
        if(this.getSubscriptions().contains(user)) return true;
        else return false;
    }
    public boolean isFriend(User user) {
        if(this.getFriendList().contains(user)) return true;
        else return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    @Override
    public String toString() {
        return this.getUsername();
    }
}
