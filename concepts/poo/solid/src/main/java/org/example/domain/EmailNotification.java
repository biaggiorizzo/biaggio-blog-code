package org.example.domain;

public class EmailNotification implements Notification {
    @Override
    public  void send(String message){
        System.out.println("[EMAIL] Sending: " + message);
    }
}
