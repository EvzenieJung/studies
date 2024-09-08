package com.studies.studies.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Print100UniqueNums {
    public static void main(String[] args) {
        List<Integer> uniqueNums = new ArrayList<>();
        while (uniqueNums.size() < 100) {
            Random randomObject = new Random();
            int ramdonNumber = randomObject.nextInt(100);
            if (!uniqueNums.contains(ramdonNumber)) {
                uniqueNums.add(ramdonNumber);
            }
        }
        uniqueNums.forEach(System.out::println);
        System.out.println("\n");
        System.out.println(uniqueNums.size());
    }
}
