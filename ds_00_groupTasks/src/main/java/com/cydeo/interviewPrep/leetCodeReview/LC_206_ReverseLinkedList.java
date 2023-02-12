package com.cydeo.interviewPrep.leetCodeReview;

import java.awt.*;

public class LC_206_ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,
                new ListNode(6))))));

        System.out.println(reverseList(head).val);

    }
    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode nextP=head;
        ListNode prev=null;

        if(current==null) return null;
        if(current.next==null) return current;

        while(current!=null && nextP!=null){
            nextP=current.next; // move nextP
            current.next=prev; // reverse the direction
            prev=current; // move prev to current position
            current=nextP; // move current to nextP
        }
        return prev;
    }
}
