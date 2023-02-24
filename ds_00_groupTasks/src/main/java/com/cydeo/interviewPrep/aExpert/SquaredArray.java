package com.cydeo.interviewPrep.aExpert;

import java.util.Arrays;

public class SquaredArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
    public static int[] sortedSquaredArray(int[] arr){
        int[] squaredArr=new int[arr.length];

        int pF=0;
        int pE=arr.length-1;
        int pNew=squaredArr.length-1;

        while(pF<=pE){
            if(Math.abs(arr[pF])>Math.abs(arr[pE])) {

                squaredArr[pNew]=arr[pF]*arr[pF];
                pF++;
            }
            else{
                squaredArr[pNew]=arr[pE]*arr[pE];
                pE--;
            }
            pNew--;
        }
        return squaredArr;
        }


    }


