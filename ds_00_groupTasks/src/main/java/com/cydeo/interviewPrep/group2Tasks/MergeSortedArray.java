package com.cydeo.interviewPrep.group2Tasks;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 3,0,0};
        int[] nums2 = {1,2};
        System.out.println(Arrays.toString(mergeArrays(nums1, nums2, 4, 2)));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        // pointer1 will track nums1
        //pointer2 will track nums2
        // we compare from back to start
        int p1 = m - 1; // start from the end of list 1
        int p2 = n - 1;// start from the end of the list
        int i = m + n - 1;
        int temp = 0;

        while (nums2.length >= 2 && p1 >= 0 && p2 >= 0 && i >= 0) {
            if (nums1[p1] <= nums2[p2]) {
                nums1[i] = nums2[p2];
                p2--;
                i--;
            } else {
                nums1[i] = nums1[p1];
                nums1[p1] = 0;
                p1--;
                i--;

            }
        }

        while (p2 >= 0) {

            nums1[i] = nums2[p2];
            p2--;
            i--;


        }

        return nums1;
    }

}