package com.cydeo.interviewPrep.leetCodeReview;

import java.util.Arrays;

public class LC_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){


        int slow=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[slow]!=nums[i]){
                slow++;
                nums[slow]=nums[i];
            }

        }
return slow+1;

    }
}
