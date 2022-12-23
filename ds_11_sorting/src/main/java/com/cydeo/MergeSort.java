package com.cydeo;

public class MergeSort {


    public static void merge(int[] left, int[] right, int[] result){
        int i=0, j=0, k=0; // pointers for each of the arrays
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[k]=left[i];
                i++;
                k++;
            }
            else{
                result[k]=right[j];
                j++;
                k++;
            }

        }
        while(i<left.length) { // if there are left overs from left array
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length) { // if there are left overs from right array
            result[k]=right[j];
            j++;
            k++;
        }
    }
}
