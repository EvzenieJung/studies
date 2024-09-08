package com.studies.studies.leetCode;

public class LengthOfLastWord58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("      t      "));
        System.out.println(lengthOfLastWord("a"));
    }

    public static int lengthOfLastWord(String s) {

        int lastWordLength = 0;
        boolean lastWordFound = false;

        for (int i = s.length() - 1; i >=0; i--) {
            if (s.charAt(i) != ' ') {
                lastWordFound = true;
                lastWordLength++;
            } else if (lastWordFound) {
                break;
            }
        }
        return lastWordLength;
    }
}
