package com.kos.maps;

import java.util.*;

public class LC_1_twoSum {
    public static void main(String[] args) {
    int[] nums={3,2,4};
    int target=6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
// int p1=0;
// int p2=nums.length-1;
// int[] solution=new int[2];
// while(p1<nums.length-1&& p2<nums.length){
// while(p1<p2) {
// if(nums[p1]+nums[p2]==target){
//     solution[0]=p1;
// solution[1]=p2;
// return solution;}
// else p2--;
// }
// p2=nums.length-1;
// p1++;

// }
// return new int[2];

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        int[] answer=new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])) {
                answer[0]=i;
                answer[1]=map.get(target-nums[i]);
            }

        }
        return answer;
    }
}
