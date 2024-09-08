package com.studies.studies.designPatterns.creational.builder;

public class Apartment {

    private int sqm;
    private int rooms;
    private String city;
    private boolean kitchen;

    public Apartment(int sqm, int rooms, String city, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.kitchen = kitchen;
    }

    public int getSqm() {
        return sqm;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public boolean hasKitchen() {
        return kitchen;
    }

    public void display() {
        System.out.println("Apartment has: ");
        if (sqm != -1) {
            System.out.println(sqm + " sqm");
        }
        if (rooms != -1) {
            System.out.println(rooms + " rooms");
        }
        if (city != null) {
            System.out.println("Apartment is in: " + city);
        }
        if (kitchen) {
            System.out.println("Kitchen is present");
        } else {
            System.out.println("No kitchen available");
        }
    }
}
