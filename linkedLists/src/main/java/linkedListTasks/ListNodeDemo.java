package linkedListTasks;

public class ListNodeDemo {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);


            System.out.println(deleteDuplicates(head));



    }
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current=head;
        while(current!=null&&current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
                current.next=null;

            }

        }
        return head;
    }
}
