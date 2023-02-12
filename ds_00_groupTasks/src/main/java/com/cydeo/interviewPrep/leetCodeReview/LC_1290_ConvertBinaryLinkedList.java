package com.cydeo.interviewPrep.leetCodeReview;

public class LC_1290_ConvertBinaryLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1,new ListNode(0,
                new ListNode(0,new ListNode(1,new ListNode(1,new ListNode(1,
                        new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(0)))))))))))));

        System.out.println(getDecimalValue(head));

    }
    public static int getDecimalValue(ListNode head) {
        ListNode current=head;
        ListNode nextNode=head;
        ListNode prev=null;
        int i=0;
        int total=0;
        while(current!=null){
            nextNode=current.next;
            current.next=prev;// change the direction
            prev=current;
            current=nextNode;


        }
        ListNode newHead=prev;
        ListNode newCurrent=newHead;
        while(newCurrent!=null){
            total+=Math.pow(2,i)*newCurrent.val;
            i++;
            newCurrent=newCurrent.next;
        }
        return total;
    }
}


