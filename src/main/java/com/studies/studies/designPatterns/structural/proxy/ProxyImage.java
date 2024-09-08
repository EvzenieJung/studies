package com.studies.studies.designPatterns.structural.proxy;

public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Proxy image: displaying: " + filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
        System.out.println("Proxy image: logging " + realImage);
    }
}
