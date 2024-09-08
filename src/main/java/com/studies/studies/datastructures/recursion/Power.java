package com.studies.studies.datastructures.recursion;

public class Power {

    public static void main(String[] args) {
        System.out.println(power(2, 4));

    }

    public static int power(int base, int exponent) {
        if (exponent < 0) {
            return -1;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
