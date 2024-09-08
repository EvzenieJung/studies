package com.studies.studies.datastructures.recursion;

public class StringPermutation {

    public static void main(String[] args) {
       permutation("per", "");
    }

    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permutation(remaining, prefix + str.charAt(i));
        }
    }
}
