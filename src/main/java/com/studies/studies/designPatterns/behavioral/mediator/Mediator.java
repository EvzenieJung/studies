package com.studies.studies.designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    List<ChatUser> users = new ArrayList<>();

    public Mediator addUser(ChatUser user) {
        users.add(user);
        return this;
    }

    public void sendMessage(ChatUser sender, String message) {
        for (ChatUser user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
