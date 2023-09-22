package com.kos.arrays;

import java.util.Arrays;

public class LC_88_Merge_Sorted_Array {

    public static void main(String[] args) {

        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1, 1, nums2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // p1 placed at the last no in nums1
        int p2 = n - 1;// p2 placed at the last no in nums2
        int pE = m + n - 1; //pE will start from the end of the nums1
        while (p2 >= 0) {
            if (p1>=0&& nums1[p1] > nums2[p2]) {
                nums1[pE] = nums1[p1];
                p1--;
            } else {
                nums1[pE] = nums2[p2];

                p2--;
            }
            pE--;

        }
        System.out.println(Arrays.toString(nums1));
        }
    }
