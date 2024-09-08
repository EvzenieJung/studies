package com.studies.studies.leetCode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
            Solution.merge(new int[]{11,12,13,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        System.out.println("i=m-1 -> "+ i);
        int j=n-1; // will point at n-1 index of nums2 array
        System.out.println("j=n-1 -> "+ j);
        int k=nums1.length-1; //will point at the last position of the nums1 array
        System.out.println("k=nums1.length-1 -> "+ k);

        // Now traversing the nums2 array
        while(j>=0){
            System.out.println("j -> "+ j);
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            System.out.println(String.format(
                    "i>=0 && nums1[i]>nums2[j]. i -> %s | nums1[i] -> %s | nums2[j] -> %s", i, nums1[i], nums2[j]));
            if(i>=0 && nums1[i]>nums2[j]){
                System.out.println(String.format(
                        "Inside first condition. i -> %s | nums1[i] -> %s | nums2[j] -> %s", i, nums1[i], nums2[j]));
                nums1[k]=nums1[i];
                System.out.println(String.format(
                        "nums1[k]=nums1[i].  nums1[k] -> %s | nums1[i] -> %s", nums1[k], nums1[i]));
                System.out.println("nums1 > " + Arrays.toString(nums1));
                k--;
                System.out.println("k => " + k);
                i--; //updating pointer for further comparisons
                System.out.println("i => " + i);
            }else{
                System.out.println("Inside second condition");
                // element at j index of nums2 array is greater than the element at i index of nums1 array
                // or there is no element left to compare with the nums1 array
                // and we just have to push the elements of nums2 array in the nums1 array.
                nums1[k] = nums2[j];
                System.out.println(String.format(
                        "nums1[k] = nums2[j].  nums1[k] -> %s | nums2[j] -> %s", nums1[k], nums2[j]));
                System.out.println("nums1 > " + Arrays.toString(nums1));
                k--;
                System.out.println("k => " + k);
                j--; //updating pointer for further comparisons
                System.out.println("j => " + j);
            }
        }
        System.out.print(Arrays.toString(nums1));
    }
}
