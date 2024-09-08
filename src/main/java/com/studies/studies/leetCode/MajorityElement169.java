package com.studies.studies.leetCode;

public class MajorityElement169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    private static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                System.out.println("Count is 0. New candidate is " + candidate);
            }
            if (candidate == nums[i]) {
                count++;
                System.out.println("Candidate " + nums[i] + " gets " + count + " points");
            } else {
                count--;
                System.out.println("Candidate " + candidate + " gets " + count + " ponits");
            }
        }
        if (count == 0) {
            return 0;
        }
        return candidate;
    }
}
