package LinkedListProblems;

public class ReverseLinkedListRecursion {
    public static void main(String[] args) {
        Node head=new Node(1,new Node(2,new Node(3,new Node(4, new Node(5)))));
        Node current=head;
        Node prev=null;
        Node nextN=null;

        while(current!=null){
            nextN=current.next;
            current.next=prev;
            prev=current;
            current=nextN;


        }
       head=prev;//

        while(head!=null){
            System.out.println(head.id);
            head=head.next;
        }



    }
}
