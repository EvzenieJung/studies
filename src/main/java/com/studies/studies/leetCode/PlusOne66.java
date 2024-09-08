package com.studies.studies.leetCode;

import java.util.Arrays;

public class PlusOne66 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
