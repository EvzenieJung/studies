package com.studies.studies.datastructures.searchig;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1,4,2,5,3,7,6,9,8})));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int bigger = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bigger;
                }
            }
        }
        return arr;
    }

}
