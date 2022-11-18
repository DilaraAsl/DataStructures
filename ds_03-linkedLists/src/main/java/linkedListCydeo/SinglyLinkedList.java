package linkedListCydeo;public class
SinglyLinkedList {
    Node head;
    Node tail;
    int size;
    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        Node n=new Node(data);
        if(isEmpty()){ // if SinglyLinkedList obj is empty
            head=n;
            tail=head;
        }
        else{
            tail.nextObj=n; // current tail should refer to n
            tail=n;

        }
        size++; //increase the size
    }
    void deleteById(int id){
        if(isEmpty()) System.err.println("List is empty!!");
        Node current=head; // we start our search from head we set current pointer to the head
        Node prev=head; // we set another pointer prev to check the previous object on the list

        while(current!=null){ // if we have not reached the end of the list
            // case 1 if we are deleting the head
            if(current==head){
                head=current.nextObj;
                current.nextObj=null; // current head is eligible for garbage collection


            }
            else if(current==tail){
                tail=prev; // set previous to tail
                prev.nextObj=null; // set previous nextObj reference to null

            }
            else{
                prev.nextObj=current.nextObj;
                current.nextObj=null;
            }
            // move the pointers prev and current on the list
            prev=current;
            current=current.nextObj;
            size--;
        }
    }
}
