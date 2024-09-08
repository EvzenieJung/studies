package com.studies.studies.datastructures.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(13));
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }
}
