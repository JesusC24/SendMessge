package com.jesusc24.sendmessage.data.model;

import java.io.Serializable;

public class Message implements Serializable {
    private String user, message, email;

    //Por defecto si no se define ningún constructor, Java implementa el constructor vacío
    //Si existe un constructor con parámetros hay quye implementarlo explicitamente

    public Message() {
    }

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
