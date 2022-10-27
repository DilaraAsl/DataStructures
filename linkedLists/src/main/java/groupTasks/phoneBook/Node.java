package groupTasks.phoneBook;

public class Node<T> {
    Node<T> next;
    T value;

    public Node(T value) {
        this.value = value;
        this.next=null;
    }
}
