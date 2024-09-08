package com.studies.studies.leetCode;

public class PalindromeSolver {
    public static void main(String[] args) {
        System.out.println(isPalindrome("apapap"));
    }

    public static boolean isPalindrome(String word) {
        word = word.trim();
        word = word.replaceAll("[0-9]","");

        int start = 0;
        int end = word.length()-1;

        while(start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
       }
        return true;
    }
}
