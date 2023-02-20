package com.cydeo.interviewPrep.leetCodeReview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LC_142_LinkedListCycleII {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1,new ListNode(2,
                new ListNode(6)));
//        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));

        System.out.println( detectCycle(list1).val);
    }

    public static ListNode detectCycle(ListNode head){
        Map<ListNode,Integer> map=new LinkedHashMap<>();
        ListNode current=head; int counter=0;
        while(current!=null){
            map.put(current,map.getOrDefault(current,0)+1);
            if(map.containsKey(current))break;
            current=current.next;
        }
        if(current.next==null) return null;
        return current;
    }

}
