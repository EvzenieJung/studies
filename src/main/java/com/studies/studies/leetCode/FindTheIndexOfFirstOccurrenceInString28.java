package com.studies.studies.leetCode;

public class FindTheIndexOfFirstOccurrenceInString28 {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        int needleIndex = 0;
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength) {
            return -1;
        }

        for (int i = 0; i < haystackLength; i++) {

            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                needleIndex++;
            } else {
                i -= needleIndex;
                needleIndex = 0;
            }

            if (needleIndex == needleLength) {
                return i - (needleIndex - 1);
            }
        }
        return -1;
    }
}
