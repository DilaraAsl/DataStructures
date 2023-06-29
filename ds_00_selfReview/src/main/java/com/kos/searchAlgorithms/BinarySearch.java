package com.kos.searchAlgorithms;

// used to find a specific value in a  sorted array
// O(log n) efficient for large SORTED arrays
// Collections.sort() using both merge sort and insertion sort time complexity 0(n log n), space complexity O(n)
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 9, 10, 11};
        System.out.println(bSearch(3, data));
    }

    private static int bSearch(int target, int[] data) {
        int low = 0;
        int high = data.length - 1;

        while (low < high) {
            int mid = high + low / 2;
            if (data[mid] == target) return mid;
            else if (data[mid] < target) {
                low = mid + 1; //target is in the right half
            } else high = mid - 1;
        }
        return -1;
    }
}