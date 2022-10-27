package groupTasks.phonebookLinkedList;

import linkedListPractice.Node;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LinkedList<T> {
  ListNode<T> head;
  ListNode<T> tail;

    public LinkedList(ListNode<T> head) {
        this.head = head;
    }

    public boolean isEmpty(){
        return head ==null;
    }

    public void add(T obj){
      ListNode<T> n=new ListNode<>(obj);
        if(isEmpty()){
            head=n;
            tail=head;
        }
        else{
            tail.next=n;
            tail=n;
        }

    }
    public void delete(T value) {
        if (isEmpty()) System.err.println("The list is empty!!!");
        ListNode<T> current = head;
        ListNode<T> prev = head; // set two pointers to search the list

        while (current != null) {
            if (current.value == value) // we found a match
            {
                if (current == head) {
                    head = current.next;// assign the next object as the head
                    current.next = null; // set current to null for garbage collection
                } else if (current == tail) {
                    prev = tail;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;

                }
                prev.next = current;
                current = current.next;

            }
        }


        }
        public void findByValue(T val){
        ListNode<T> current=head;


        }
    }


