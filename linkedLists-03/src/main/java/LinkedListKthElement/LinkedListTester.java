package LinkedListKthElement;

public class LinkedListTester {
    public static void main(String[] args) {
        Node n=new Node(0);
        Node kNode=new Node(0);
        Node current=n;
        kNode=current;
        LinkedList list=new LinkedList(n);
        int k=3;
        int pointer=0;
        for (int i = 1; i <=10 ; i++) {
            current.next=new Node(i);
            current=current.next;

            if(i>=k && i<10-k+1){// determines where to start and stop the pointer
                pointer=i-k;
                kNode=current;
            }
            if(i==10){
                System.out.println(kNode);
            }

        }
        System.out.println(current+" "+pointer);


    }
}
