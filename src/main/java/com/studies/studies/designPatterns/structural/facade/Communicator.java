package com.studies.studies.designPatterns.structural.facade;

public class Communicator {
    public void send(String data) {
        System.out.println("Sending data: " + data);
    }

    public void receive(String data) {
        System.out.println("Receiving response: " + data);
    }
}
