package com.kos.arrays;

/**
 * Given an integer array nums, find the
 * subarray
 * with the largest sum, and return its sum.
 */
public class LC_53_maxSubArray {
    public static void main(String[] args) {


    }

    public static int findMaxTotalSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        sum = Math.max(sum, nums[0]); // if there is only one element in the array
        return sum;
    }

}
