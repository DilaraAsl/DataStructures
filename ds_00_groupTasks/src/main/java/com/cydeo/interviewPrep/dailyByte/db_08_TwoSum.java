package com.cydeo.interviewPrep.dailyByte;

public class db_08_TwoSum {
    public static void main(String[] args) {
        int[] arr={1,3,6,7,2,4,8,1};
        int target=22;
        System.out.println(isTwoSum(arr,target));
    }
    public static boolean isTwoSum(int[] arr,int target){
        int right=arr.length-1;
        int left=0;
        if(arr.length==1) return false;
        while(left<=arr.length-2){
            if(right>left){
            if(arr[left]+arr[right]==target)
                return true;
            else {
                right--;
            }}
            else {
                right=arr.length-1;
                left++;}
        }
        return false;
    }
}
