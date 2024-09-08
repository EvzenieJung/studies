package com.studies.studies.designPatterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailNotificationListener  emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();
        editor.events.subscribe("open", emailNotificationListener);
        editor.events.subscribe("save", emailNotificationListener);
        editor.events.subscribe("open", logOpenListener);

        editor.openFile("example.txt");
        editor.saveFile();

        System.out.println("--------------------------------");

        editor.events.unsubscribe("open", emailNotificationListener);
        editor.openFile("example2.txt");
        editor.saveFile();
    }
}
