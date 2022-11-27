package com.cydeo;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity){
        this.items=new int[capacity];
        this.size=0;
    }
    public int peek() throws NoSuchFieldException {
        if(size==0) throw new NoSuchFieldException();
        return items[0];// return the root
    }
}
