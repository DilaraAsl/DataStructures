package LinkedListProblems;

import java.util.*;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

        // System.out.println(isPalindrome(head));

        System.out.println(oddEvenList(head));

    }

    public static boolean isPalindrome(ListNode head) {

        ListNode current = head;
        ListNode newCurrent = head;
        int size = 0;
        Stack<Integer> stack = new Stack<>();
        while (current != null) {
            stack.push(current.val);
            current = current.next;
            size++;
        }
        int i = 0;
        while (i < size / 2) {
            if (stack.peek() != newCurrent.val) {

                return false;
            }
            stack.pop();
            newCurrent = newCurrent.next;
            i++;
        }
        return true;

    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;


        while (even != null && even.next != null) { // even will be at the end of the linked list we are making sure that it is not null
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
           

        }

        odd.next = evenHead; // linked odd and even lists

        return head;

    }


}
