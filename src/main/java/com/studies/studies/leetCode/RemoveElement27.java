package com.studies.studies.leetCode;

import java.util.Arrays;

public class RemoveElement27 {

    public static void main(String[] args) {
        int k = removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println(k);
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i=0; i<nums.length;i++) {
            System.out.println("Iteration " + i);
            System.out.println("Before if");
            System.out.println(Arrays.toString(nums));
            if (nums[i] != val) {
                System.out.println("Inside if");
                nums[k] = nums[i];
                System.out.println(Arrays.toString(nums));
                k++;
            }
        }
        System.out.println("end");
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
