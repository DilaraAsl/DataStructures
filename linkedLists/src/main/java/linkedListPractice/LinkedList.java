package linkedListPractice;

public class LinkedList {
  Node head;
  Node tail;
 int size;

    public boolean isEmpty(){
        return head ==null;
    }
    public void add(String str){
        Node n=new Node(str);
        if(isEmpty()){
            head=n;
            tail=head;
        }
        else{
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void delete(String value){
        if(isEmpty()) System.err.println("The list is empty!!!");
        Node current=head;
        Node prev=head; // set two pointers to search the list

       while(current!=null){
           if(current.value==value) // we found a match
           { // if we want to the delete the head
               if(current==head){
                   head=current.next;// assign the next object as the head
                   current.next=null; // set current to null for garbage collection
               }
               else if(current==tail){
                   prev=tail;
                   prev.next=null;
               }
               else{
                   prev.next=current.next;
                   current.next=null;

               }
               prev.next=current;
               current=current.next;
               size--;
           }
       }
    }
}
