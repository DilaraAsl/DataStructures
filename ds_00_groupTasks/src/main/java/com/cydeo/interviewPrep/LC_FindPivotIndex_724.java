package com.cydeo.interviewPrep;

import java.util.*;
import java.util.function.Function;

public class LC_FindPivotIndex_724 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(findPivotIndex(nums));
    }
    public static int findPivotIndex(int[] nums){

        int sumLR=nums[0];// first no
        int sumRL=0;
        int index=0;
        for (int j = nums.length-1; j >0 ; j--) {
            sumRL+=nums[j]; // don't include 1st no to the sum
        }
        for (int i = 1; i <nums.length ; i++) {

            sumRL-=nums[i]; // remove the potential pivot
            if(sumLR==sumRL) {return i;}
            sumLR+=nums[i];
        }

     return -1;
    }

}
