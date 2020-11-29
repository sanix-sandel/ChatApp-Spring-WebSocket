package com.sanix.ChatApp.domain;


public class MessageModel {

    private String message;
    private String fromLogin;

    public String getContent() {
        return message;
    }

    public void setContent(String content) {
        this.message = content;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
