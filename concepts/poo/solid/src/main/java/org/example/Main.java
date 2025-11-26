package org.example;

import org.example.aplication.NotificationCenter;
import org.example.domain.EmailNotification;
import org.example.domain.PushNotification;
import org.example.domain.SMSNotification;

public class Main {
    public static void main(String[] args) {

        NotificationCenter emailCenter =
                new NotificationCenter(new EmailNotification());
        emailCenter.sendMessage("Hello via Email!");

        NotificationCenter smsCenter =
                new NotificationCenter(new SMSNotification());
        smsCenter.sendMessage("Hello via SMS!");

        NotificationCenter pushCenter =
                new NotificationCenter(new PushNotification());
        pushCenter.sendMessage("Hello via Push!");
    }
}