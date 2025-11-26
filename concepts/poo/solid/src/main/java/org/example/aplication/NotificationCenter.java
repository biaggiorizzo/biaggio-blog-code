package org.example.aplication;
import org.example.domain.Notification;

public class NotificationCenter {

    private final Notification notification;

    public NotificationCenter(Notification notification) {
        this.notification = notification;
    }

    public void sendMessage(String message) {
        notification.send(message);
    }

}
