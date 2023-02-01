package com.cydeo.interviewPrep.leetCodeReview;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,5,9,7};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target){
      int [] result=new int[]{0,0};
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }

        }
        return result;
    }
}
