package com.arcproject.arc.Model;

import android.app.Notification;

public class Sender {

    public Notification notification;
    public String to;


    public Sender(Notification notification, String to) {
        this.notification = notification;
        this.to = to;
    }

    public Sender() {
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
