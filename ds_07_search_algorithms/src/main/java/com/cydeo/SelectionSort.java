package com.cydeo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers=new int[10];
        Random random=new Random();
        for(int i=0; i<numbers.length; i++){
            numbers[i]=random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(selectionSortNumbers(numbers)));
    }
    public static int[] selectionSortNumbers(int[] numbers){
        for(int i=0; i< numbers.length-1; i++){
            int minIndex=i;
            for(int j=i+1; j<numbers.length;j++){
                if(numbers[j]<numbers[minIndex]){
                    minIndex=j;
                }
            }
            // after finding the minIndex swap the numbers and reassign the minIndex on line 19
            swap(numbers,i,minIndex);

        }
        return numbers;
    }

    private static void swap(int[] numbers, int a, int b){
        int temp=numbers[a];
        numbers[a]=numbers[b];
        numbers[b]=temp;
    }
}
