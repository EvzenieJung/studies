package com.studies.studies.interview1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {

    private final int id;
    private final String name;
    private final String country;
    private final List<Integer> ratings;
    private static int nextId = 1;

    public City(String name, String country) {
        this.id = nextId++;
        this.name = name;
        this.country = country;
        this.ratings = new ArrayList<Integer>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public List<Integer> getRatings() {
        return Collections.unmodifiableList(ratings);
    }

    public void addRating(Integer rating) {
        ratings.add(rating);
    }

    public Double calculateAverageRating() {
        return ratings.isEmpty() ? 0 : ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
