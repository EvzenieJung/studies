package com.studies.studies.designPatterns.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ChatUser user1 = new ChatUser("Alice", mediator);
        ChatUser user2 = new ChatUser("Bob", mediator);
        ChatUser user3 = new ChatUser("Charlie", mediator);

        mediator.addUser(user1).addUser(user2).addUser(user3);

        user1.sendMessage("Hi everyone!");
    }
}
