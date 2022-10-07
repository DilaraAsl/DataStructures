package LinkedListProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(1,new ListNode(1))));

        System.out.println(isPalindrome(head));



    }

    public static boolean isPalindrome(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        ListNode nextN=null;


        // copy the LinkedList
        ListNode newHead=new ListNode(head.val);
        System.out.println(newHead.val);

        ListNode currentN=newHead;
        ListNode originalPointer=head;
        while(originalPointer!=null&& originalPointer.next!=null){
            originalPointer=originalPointer.next;
            currentN.next=new ListNode(originalPointer.val);
            currentN=currentN.next;

        }

        // reverse the LinkedList

        while(current!=null&& current.next!=null)
        {
            nextN=current.next; // move the next node
            current.next=prev; // link the current node to prev
            prev=current; // move prev to current
            current=nextN; // move current to next node
        }

        head=prev;
        ListNode pointer1=head;
        ListNode pointer2=newHead;

        while(pointer1!=null){
            if(pointer1.val!=pointer2.val) return false;
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return true;
    }



      }
