package com.cydeo.interviewPrep.leetCodeReview;

import java.util.HashMap;
import java.util.Map;

public class LC_1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(noOfGoodPairs(nums));
    }
    public static int noOfGoodPairs(int[] nums){

//        Map<Integer,Integer> map=new HashMap();
        int count=0;
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j])
                {
//                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                    count++;
                }


            }


        }
//        return map.values().stream().reduce(0,Integer::sum);
        return count;
    }
}
