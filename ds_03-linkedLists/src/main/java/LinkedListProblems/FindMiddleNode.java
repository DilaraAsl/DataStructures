package LinkedListProblems;

public class FindMiddleNode {
    public static void main(String[] args) {
        Node head=new Node(1,new Node(2,new Node(3,new Node(4, new Node(5, new Node(6))))));
        int counter=0;
        Node fast=head;
        Node slow=head;
        int steps=0;
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            counter++;
  if(counter%2==1){
      slow=slow.next;
  }
//            if(counter>=2){
//                steps=counter/2;
//            for (int i = 1; i <counter-steps ; i++) {
//                slow=slow.next;
//
//            }}

        }
        System.out.println(slow.id);
        System.out.println(counter);
    }
}
