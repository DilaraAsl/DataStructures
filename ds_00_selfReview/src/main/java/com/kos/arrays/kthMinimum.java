package com.kos.arrays;

/**
 * Given an array of integers. You take an integer k, and go on adding the elements of the array consecutively.
 * After each addition, the sum must be at least +1. Find least possible value of k satisfying this condition.
 */
public class kthMinimum {
    public static void main(String[] args) {
        int[] nums={2, -4, 3, 1};
        System.out.println(findKthMinimum(nums));
    }
    public static int findKthMinimum(int[] nums){
        int sum=0; int k=0;
        for (int i = 0; i <nums.length ; i++) {
         sum+=nums[i];
            if(sum<1){
            k=Math.abs(sum)+1;
            }
        }
        return k;
    }
}
