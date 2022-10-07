package LinkedListProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindCycle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next;
        System.out.println(detectCycle(listNode).val);
    }

    public static ListNode detectCycle(ListNode listNode) {
        ListNode current = listNode;
        Set<ListNode> nodeSet = new LinkedHashSet<>();
        while (current != null) {

            if (nodeSet.contains(current)) return current;
            else nodeSet.add(current);
            current = current.next;

        }

        return null;

    }
}