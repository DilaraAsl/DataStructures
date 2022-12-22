package com.cydeo.week34;

import java.util.Arrays;

public class ProductOfElementInArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(multiplyWithPrevAndNext(arr)));
    }
    public static int[] multiplyWithPrevAndNext(int[] arr){
        int[] tempArr=new int[arr.length+2];
        //expand the array by adding 1 at the front and 1 at the end
        tempArr[0]=1;
        tempArr[tempArr.length-1]=1;
        // copy the array
        for (int i = 1; i <tempArr.length-1 ; i++) {
            tempArr[i]=arr[i-1];

        }

        for (int i = 1; i < tempArr.length-1; i++) {
            arr[i-1]=tempArr[i-1]*tempArr[i+1];
            if(i==1|| i==tempArr.length-2){
                arr[i-1]*=tempArr[i]; //multiply the first and last by itself
            }
        }
        return arr;
    }
}
