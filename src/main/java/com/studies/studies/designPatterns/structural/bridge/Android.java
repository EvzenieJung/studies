package com.studies.studies.designPatterns.structural.bridge;

public class Android implements PhoneOS {

    @Override
    public void upload(String data) {
        System.out.println("Uploading data on Android: " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading data from Android: " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying data on Android: " + data);
    }
}
