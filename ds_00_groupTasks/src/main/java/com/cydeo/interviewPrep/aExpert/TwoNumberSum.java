package com.cydeo.interviewPrep.aExpert;

import java.util.*;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array={14,0};
        int targetSum=14;
        System.out.println(Arrays.toString(twoNumberSumSol3(array,targetSum)));

    }

    public static int[] twoNumberSum(int[] array,int targetSum){
    int[] nums=new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(targetSum-array[i]==array[j]) {
                    nums[0]=array[i];
                    nums[1]=array[j];
                    return nums;

                }

            }
        }
        return new int[0];

        }
    public static  int[] twoNumberSumSol2(int[] array, int targetSum){
        Set<Integer> set=new HashSet<>();
        for(int num:array){
            if(set.contains(targetSum-num)){
                return new int[]{targetSum-num,num};
            }
            else set.add(num);
        }
        return new int[0];
    }
    public static  int[] twoNumberSumSol3(int[] array, int targetSum){
        Arrays.sort(array);
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left]+array[right]==targetSum) {
                return new int[]{array[left],array[right]};
            }
            else if(array[left]+array[right]<targetSum) left++;
            else right--;

        }
        return new int[0];
    }

}
