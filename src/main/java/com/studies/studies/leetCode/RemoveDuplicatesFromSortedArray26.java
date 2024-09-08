package com.studies.studies.leetCode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        int k = removeDuplicates(new int[]{1,1,2,2,2,3,5,5});
        System.out.println(k);
    }
    private static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1 ;i<nums.length;i++) {
            if (nums[i] != nums [i -1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
