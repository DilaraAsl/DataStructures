package com.cydeo.interviewPrep.leetCodeReview;

public class MyHashSet {
    boolean[] array;

    public MyHashSet(){
       array=new boolean[9999999];
    }
    public void add(int key){
        array[key]=true;
    }

    public void remove(int key){
        array[key]=false;
    }
    public boolean contains(int key){
        return array[key];
    }
}
