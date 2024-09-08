package com.studies.studies.designPatterns.creational.builder;

public class ApartmentBuilder {
    private int sqm = -1;
    private int rooms = -1;
    private String city = "";
    private boolean kitchen = false;

    public ApartmentBuilder setSqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public ApartmentBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder hasKitchen(boolean kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    public Apartment build() {
        Apartment apartment = new Apartment(sqm, rooms, city, kitchen);
        setDefaultValues();
        return apartment;
    }

    private void setDefaultValues() {
        sqm = -1;
        rooms = -1;
        city = "";
        kitchen = false;
    }
}
