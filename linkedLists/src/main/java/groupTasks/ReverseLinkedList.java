package groupTasks;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListNode n=new SinglyLinkedListNode(1);
        n.next=new SinglyLinkedListNode(2);
        n.next.next=new SinglyLinkedListNode(2);
        n.next.next.next=new SinglyLinkedListNode(3);
        n.next.next.next.next=new SinglyLinkedListNode(3);



        SinglyLinkedListNode newHead=reverse(n);
        SinglyLinkedListNode current=newHead;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode current=llist;
        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode nextP=null;

        while(current!=null){
            nextP=current.next;
            current.next=prev;
            prev=current;
            current=nextP;
        }
     llist=prev;
        return llist;
    }
}
