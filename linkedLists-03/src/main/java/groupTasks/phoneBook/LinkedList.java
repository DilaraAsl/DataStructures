package groupTasks.phoneBook;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinkedList<T> {
    Node<T> head;
    int size = 0;

    public LinkedList() {
        this.head = null;
    }

    public void add(T value) { // adds the value at the end of the list
        Node<T> newNode = new Node<>(value); // create a new node to add to the list with the given value
        if (head == null) head = newNode;
        else {
            Node<T> current = head; // we need a node to traverse the linked list
            while (current.next != null) { //we make sure that current stops at tail
                current = current.next;
            }
            current.next = newNode; // we connect the newNode to the end of the list

        }
        size++;
    }

    public void add(int position, T value) {
        Node<T> newNode = new Node<>(value);
        if (position > size + 1) { // check if the position is valid
            System.out.println("invalid position");
            return;
        }

        if (position == 1) { // add the new node at the beginning of the list
            Node<T> current = head;
            head = newNode;
            head.next = current;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;

        while (position - 1 > 0) { // we need to move the pointers to the desired position

            prev = current;
            current = current.next;
            position--; // decrease the position

        }
        prev.next = newNode;
        newNode.next = current;
        size++;
    }

    public Node<T> findByKey(T value){
        Node<T> current=head;
        while(current!=null){
            if(String.valueOf(value).equals(String.valueOf(current))) return current;
            else current=current.next;
        }

        return null;
    }

    public void delete(T key) {

        Node<T> prev = null;
        Node<T> current = head;
        Node<T> nextNode = null;
        boolean keyExists = false;

        if (String.valueOf(key).equals(String.valueOf(head))) { // if the head node is the key
            head = head.next;
            keyExists = true;
        }


        while (current.next != null) {
            nextNode = current.next;
            if (String.valueOf(key).equals(String.valueOf(current))) {
                prev.next = nextNode;
                keyExists = true;
                break;
            }
            prev = current;
            current = current.next;

        }
        if (keyExists == false && String.valueOf(key).equals(String.valueOf(current))) { // check if the last node contains the key
            prev.next = null;
        }
        if (keyExists) size--; // reduce the key if we found a match which means it is deleted
        else System.out.println(" Given value is not present in this linked list");

    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String str = "{ ";

        Node<T> current = head;

        if (current == null)
            return str + " }";

        while (current.next != null) {
            str += String.valueOf(current.value) + " -> ";
            current = current.next;
        }

        str += String.valueOf(current.value);
        return str + " }";
    }
}
