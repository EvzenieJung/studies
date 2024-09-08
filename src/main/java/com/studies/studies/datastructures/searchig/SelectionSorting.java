package com.studies.studies.datastructures.searchig;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{3,1,1,2,5,4,6,7})));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }



}
