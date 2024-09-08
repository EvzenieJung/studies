package com.studies.studies.leetCode;

public class JumpGame55 {

    public static void main(String[] args) {
        System.out.println(canJump2(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {
        int goal = nums[nums.length-1];
        for (int i = nums.length-1; i>=0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    public static boolean canJump2(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            System.out.println("Before if");
            System.out.printf("i -> %s, reachable -> %s%n", i, reachable);
            if(i > reachable) return false;
            System.out.println("After if");
            System.out.printf("i -> %s, nums[i] -> %s, reachable -> %s%n", i, nums[i], reachable);
            reachable = Math.max(reachable, i + nums[i]);
            System.out.printf("reachable -> %s%n", reachable);
        }
        return true;
    }
}
