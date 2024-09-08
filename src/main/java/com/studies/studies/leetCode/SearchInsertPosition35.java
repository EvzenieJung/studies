package com.studies.studies.leetCode;

public class SearchInsertPosition35 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        var startIndex = 0;
        var endIndex = nums.length - 1;

        while (startIndex <= endIndex) {

            int middle = (startIndex + endIndex)/2;

            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]){
                endIndex = middle - 1;
            } else {
                startIndex = middle + 1;
            }
        }
        return startIndex;
    }

}
