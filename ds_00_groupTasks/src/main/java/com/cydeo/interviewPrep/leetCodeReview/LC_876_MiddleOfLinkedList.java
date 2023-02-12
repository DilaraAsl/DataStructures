package com.cydeo.interviewPrep.leetCodeReview;

public class LC_876_MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,
                new ListNode(6))))));

        System.out.println(getMiddleNode(head).val);

    }
    public static ListNode getMiddleNode(ListNode head){
        // there is only one item return that node
        ListNode current=head;
        ListNode mid=null;

        if(current.next==null) return current;
        if(current.next.next==null) return current.next;
        int i=1;
        while(current.next!=null){
            current=current.next;
            i++; // linked list size

        }
        ListNode newPointer=head;
        int counter=0;

        while(newPointer!=null&& counter<i/2 ){
            counter++;
            newPointer=newPointer.next;


        }

        return newPointer;


    }
}
