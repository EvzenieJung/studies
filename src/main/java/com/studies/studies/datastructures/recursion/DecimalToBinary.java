package com.studies.studies.datastructures.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }

    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        return n%2 + 10*decimalToBinary(n/2);
    }
}
