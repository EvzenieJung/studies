package com.studies.studies.datastructures.searchig;

import java.util.Arrays;

public class InsertionSorting {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{3,1,2,5,4,6})));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println("temp is " + temp);
            int j = i;
            System.out.println("j is " + j);
            while(j > 0 && arr[j-1]>temp) {
                System.out.println("Inside while -------");
                System.out.println("arr[j-1] -> " + (arr[j-1]));
                System.out.println("arr[j-1]>temp -> " + (arr[j-1]>temp));
                arr[j] = arr[j-1];
                System.out.println("arr[j] is " + arr[j]);
                j--;
                System.out.println("j is " + j);
                System.out.println(Arrays.toString(arr));
            }
            arr[j] = temp;
            System.out.println("arr[j] is " + arr[j]);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
