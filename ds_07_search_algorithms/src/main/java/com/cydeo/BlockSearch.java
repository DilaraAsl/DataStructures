package com.cydeo;

public class BlockSearch {

    public static int jumpSearch(int[] arr,int data){
        int blockSize=(int)Math.sqrt(arr.length);
        int start=0;
        int next=blockSize;

        while(start<arr.length && arr[next-1]<data){ // jump if this condition is met
            start=next;
            next+=blockSize;
            if(next>arr.length) next=arr.length;//
        }
        for (int i = start; i <next ; i++) {
            if(arr[i]==data) return i;
        }
        return -1;
    }
}
