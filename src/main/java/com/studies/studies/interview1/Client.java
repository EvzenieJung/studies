package com.studies.studies.interview1;

import java.util.regex.Pattern;

public class Client {

    static String defaultString = "(Hamburg, Germany, [1,2,3,4]); (Jeddah, Saudi-Arabia, [5,3,7,4]); (Singapore, Singapore, [2,3]); (Los Angeles, USA, [4,3,8,7])";

    public static void main(String[] args) {


        var cities = CityParseUtil.parseFromString(defaultString);
        CityParseUtil.printCities1(cities);
        System.out.println("----------------------------------------");
        CityParseUtil.printCities2(cities);
        System.out.println("----------------------------------------");
        CityParseUtil.printCitiesByRanking(cities);

    }
}
