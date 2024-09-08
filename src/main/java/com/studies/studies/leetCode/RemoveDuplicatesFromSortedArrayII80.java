package com.studies.studies.leetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII80 {

    public static void main(String[] args) {
        int k = removeDuplicates(new int[]{1,1,1,2,2,2,3,3});
        System.out.println(k);
    }

    private static int removeDuplicates(int[] nums) {
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index-2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
