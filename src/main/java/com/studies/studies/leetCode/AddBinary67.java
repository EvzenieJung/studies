package com.studies.studies.leetCode;

public class AddBinary67 {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {

        int ai = a.length() - 1;
        int bj = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (ai >= 0 || bj >= 0 || carry != 0) {
            if (ai >= 0) {
                carry += a.charAt(ai) - '0';
                ai--;
            }
            if (bj >= 0) {
                carry += b.charAt(bj) - '0';
                bj--;
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }

        return sb.reverse().toString();
    }
}
