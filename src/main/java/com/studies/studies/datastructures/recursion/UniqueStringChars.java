package com.studies.studies.datastructures.recursion;

public class UniqueStringChars {

    public static void main(String[] args) {
        //System.out.println(uniqueStringChars("#441"));
        System.out.println(isUniqueChars("eujfyb"));
    }

    public static boolean uniqueStringChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
