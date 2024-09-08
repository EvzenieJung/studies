package com.studies.studies.datastructures.searchig;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 3, 6, 7, 10, 12, 14, 16}, 30));
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (nums[mid] != target && start <= end) {
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        if (nums[mid] == target) {
            return mid;
        }
        return -1;
    }
}
