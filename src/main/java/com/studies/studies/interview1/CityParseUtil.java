package com.studies.studies.interview1;

import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityParseUtil {


    Logger log = Logger.getLogger(CityParseUtil.class.getName());

    public static List<City> parse(String cityStringList) {
        List<City> cities = new ArrayList<>();

        Pattern pp = Pattern.compile("\\(([^,]+), ([^,]+), \\[([^\\]]+)\\]\\)");

        Matcher matcher = pp.matcher(cityStringList);

        while (matcher.find()) {
            String name = matcher.group(1);
            String country = matcher.group(2);
            String[] ratings = matcher.group(3).split(",");

            City city = new City(name, country);
            for (String rating : ratings) {
                city.addRating(Integer.parseInt(rating.trim()));
            }
            cities.add(city);
        }
        return cities;
    }

    public static List<City> parseFromString(String cityStringList) {
        List<City> cities = new ArrayList<>();
        //(Hamburg, Germany, [1,2,3,4]); (Jeddah, Saudi-Arabia, [5,3,7,4]); (Singapore, Singapore, [2,3]); (Los Angeles, USA, [4,3,8,7])
        String[] splits = cityStringList.split("; ");
        for (String split : splits) {
            split = split.substring(1, split.length() - 1);

            int firstComma = split.indexOf(",");
            int secondComma = split.indexOf(",", firstComma + 1);
            int bracketStart = split.indexOf("[");

            String name = split.substring(0, firstComma);
            String country = split.substring(firstComma + 2, secondComma);
            String ratingsString = split.substring(bracketStart);

            String[] ratings = ratingsString.substring(1, ratingsString.length() -1).split(",");

            City city = new City(name, country);
            for (String rating : ratings) {
                city.addRating(Integer.parseInt(rating.trim()));
            }
            cities.add(city);
        }
        return cities;
    }

    public static void printCities1(List<City> cities) {
        cities.forEach(System.out::println);
    }

    public static void printCities2(List<City> cities) {
        cities.forEach(city -> System.out.println("City ID: " + city.getId() + ", Name: " + city.getName() + ", Country: " + city.getCountry() + ", Ratings: " + Arrays.toString(city.getRatings().toArray())));
    }

    public static void printCitiesByRanking(List<City> cities) {
        cities.stream()
                .sorted((c1, c2) -> Double.compare(c2.calculateAverageRating(), c1.calculateAverageRating()))
                .forEach(city -> System.out.println("City " + city.getName() + " has an average rating of " + city.calculateAverageRating()));

    }

}
