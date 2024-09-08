package com.studies.studies.designPatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        Apartment apartment = apartmentBuilder.setSqm(100).setCity("Prague").setRooms(3).hasKitchen(true).build();
        apartment.display();
        Apartment apartment1 = apartmentBuilder.setSqm(150).setCity("London").build();
        apartment1.display();
    }
}
