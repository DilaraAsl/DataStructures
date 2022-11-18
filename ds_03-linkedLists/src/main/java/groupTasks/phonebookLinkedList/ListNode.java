package groupTasks.phonebookLinkedList;

public class ListNode<T> {
    ListNode<T> next;
  T value;

    public ListNode(T value) {
        this.value = value;
    }

    public ListNode(ListNode<T> next) {
        this.next=next;
    }

    public ListNode(ListNode<T> next, T value) {
        this.next = next;
        this.value = value;
    }
}
