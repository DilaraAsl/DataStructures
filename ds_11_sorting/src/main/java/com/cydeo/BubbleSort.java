package com.cydeo;

public class BubbleSort {
    public static  int[] bubbleSort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            boolean swap=false;
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                    swap=true;
                }
                }
                if(!swap) return arr; // we went through the loop and could not find anything to swap --swap is false
            }
            return arr;
        }



    public static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
