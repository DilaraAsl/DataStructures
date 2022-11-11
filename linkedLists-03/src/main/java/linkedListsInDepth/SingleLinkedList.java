package linkedListsInDepth;

public class SingleLinkedList {
    Node head;
    Node tail;
    int size;

    void add(Node n){
        if(head==null) head=tail=n;
        else {tail.next=n; tail=n;}

    }

    void printNodes(){
        Node current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }

    int getNth(int num){
        Node current=head;
        int counter=0;
        while(current!=null){

            if(counter==num){
               return current.value;

            }
            counter++;
            current=current.next;
        }
        assert(false);
        return 0;
    }

    void deleteList(){
        Node current=head;
        Node prev=current;
        while(current!=null){
            head=null;
          current=current.next;
          prev.next=null;
          prev=current;
        }
    }
   void pop(){
        Node current=head;
       Node prev=head;
        if(head!=null){
            current=head.next;
       }

        while(current!=null&& current.next!=null){
            current=current.next;

            prev=prev.next;
        }
        System.out.println(current.value);
        prev.next=null;
    }
    void insertNth(int n, int val) {
        Node current = head;
        Node newNode = new Node(val);

        int counter = 0;
        while ( counter < n-1) {

            current = current.next;
            counter++;
        }
        newNode.next=current.next;
        current.next=newNode;

    }
}
