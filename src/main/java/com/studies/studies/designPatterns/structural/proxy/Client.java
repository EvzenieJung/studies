package com.studies.studies.designPatterns.structural.proxy;

public class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("image1.jpg");
        image.display();
        System.out.println("----------------------------------------");
        image.display();
    }
}
