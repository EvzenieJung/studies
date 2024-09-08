package com.studies.studies.datastructures.recursion;

import java.lang.reflect.Array;

public class FindByMidElement {

    static int count = 0;
    public static void main(String[] args) {
        int[] nums = new int[1000000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int high = nums.length - 1;
        long startTime = System.currentTimeMillis();
        findByMidElement(nums, 0, high, 988877);

        System.out.println("Found value at " + count + " try");
        long endTime = System.currentTimeMillis();
        System.out.println("Total time :: "+ (endTime - startTime) + " ms");
    }

    public static int findByMidElement(int[] collection, int start, int end, int number) {
        count++;
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (collection[mid] == number) {
                return mid;
            }
            if (collection[mid] > number) {
                return findByMidElement(collection, start, mid - 1, number);
            }
            return findByMidElement(collection, mid + 1, end, number);
        }
        return -1;
    }
}
