package groupTasks;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListNode n=new SinglyLinkedListNode(1);
        n.next=new SinglyLinkedListNode(2);
        n.next.next=new SinglyLinkedListNode(2);
        n.next.next.next=new SinglyLinkedListNode(3);
        n.next.next.next.next=new SinglyLinkedListNode(3);



        SinglyLinkedListNode newHead=removeDuplicates(n);
        SinglyLinkedListNode current=n;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }



    }

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;
        while (current != null && current.next != null) {
            // if current is null there is no list
            // if current.next is null then there are no duplicates
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
            return head;
    }
}
