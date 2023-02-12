package com.cydeo.interviewPrep.leetCodeReview;

public class LC_21_MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1,new ListNode(2,
                new ListNode(6)));
        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode head=mergeLists(list1,list2);
        ListNode current=head;
        while(current!=null) {

            System.out.println(current.val);
            current=current.next;
        }
    }
    public static ListNode mergeLists(ListNode list1,ListNode list2){
        if(list1==null&& list2==null) return null;
        if(list1==null && list2!=null) return list2;
        if(list1!=null && list2==null) return list1;

        ListNode head=new ListNode(0);


        ListNode current=head;
        while(list1!=null && list2!=null){

            if(list1.val<=list2.val) { // compare 1 and 1
                current.next=list1; // add 1
                list1=list1.next; // current1 moves
            }
            else if(list1.val>list2.val){
                current.next=list2;
                list2=list2.next;
            }
            System.out.println("current:"+current.val);
            current=current.next; // current moves to the next node

        }


        if(list1!=null){
            while(list1!=null){
                current.next=list1;
                list1=list1.next;
                current=current.next;

            }


        }
        if(list2!=null){
            while(list2!=null){
                current.next=list2;
                list2=list2.next;
                current=current.next;

            }

        }
        return head.next;

        }

}
