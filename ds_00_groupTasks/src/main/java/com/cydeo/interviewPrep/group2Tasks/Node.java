package com.cydeo.interviewPrep.group2Tasks;

public class Node {
    Node next;
    int val;
    Node(){};
    Node(int val){
        this.val=val;
    }
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}
