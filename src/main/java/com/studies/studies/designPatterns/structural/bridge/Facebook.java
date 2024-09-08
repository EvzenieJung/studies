package com.studies.studies.designPatterns.structural.bridge;

public class Facebook implements App {

    private final PhoneOS phoneOS;

    public Facebook(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public void runApp() {
        phoneOS.upload("Facebook data");
        phoneOS.download("https://www.facebook.com/");
        phoneOS.display("Facebook app loaded");
        System.out.println();
    }
}
