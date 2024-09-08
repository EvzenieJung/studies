package com.studies.studies.interview1;

import java.util.HashSet;
import java.util.Set;

public class Utils {

    public static void checkForDuplicates(int[] values){
        Set<Integer> setOfValues = new HashSet<>();
        for (int value : values) {
            if (!setOfValues.add(value)) {
                System.out.println("Duplicate value found: " + value);
            }
        }
    }
}
