package com.studies.studies.designPatterns.structural.bridge;

public class Instagram implements App {

    private PhoneOS phoneOS;

    public Instagram(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public void runApp() {
        System.out.println();
        phoneOS.display("cached data");
        phoneOS.upload("Instagram.com");
        phoneOS.display("instagram data");
        phoneOS.display("fresh data");
        System.out.println();
    }
}
