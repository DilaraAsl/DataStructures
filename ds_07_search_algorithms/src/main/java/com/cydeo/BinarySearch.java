package com.cydeo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums=new int[10];
        for (int i = 0; i <10 ; i++) {
            nums[i]=i;
        }
        System.out.println(binarySearchIterator(nums,6));
    }
    public static int binarySearchIterator(int[] arr, int data){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(arr[middle]==data) return middle;
            if (data < arr[middle]) {
                right=middle-1;

            }
            else left=middle+1;
        }
        return -1;
    }
}
