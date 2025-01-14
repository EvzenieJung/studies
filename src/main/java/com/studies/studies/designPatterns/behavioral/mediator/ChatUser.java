package com.studies.studies.designPatterns.behavioral.mediator;

public class ChatUser {
    String name;
    Mediator mediator;

    public ChatUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println(name + ": sending message " + message);
        mediator.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println(name + ": received message " + message);
    }

}
