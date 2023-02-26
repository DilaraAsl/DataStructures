package com.cydeo.interviewPrep.aExpert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonConstructableChange {

    public static void main(String[] args) {
        int[] coins={1,5,1,1,1,10,15,20,100};
        System.out.println(nonConstructibleChange(coins));

    }

    public static int nonConstructibleChange(int[] nums) {
        // Write your code here.
        Arrays.sort(nums);
        if (nums.length==0) return -1;
        Arrays.sort(nums);
        int change=nums[0];

        for(int i=1; i<nums.length; i++){

            if(change+1<nums[i]) break;
            change+=nums[i];
        }
        return change+1;

    }
}
