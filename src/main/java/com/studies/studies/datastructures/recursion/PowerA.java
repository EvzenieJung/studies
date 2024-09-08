package com.studies.studies.datastructures.recursion;

public class PowerA {

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }

    static int power(int a, int b) {
        if (b < 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1); }
    }
}
