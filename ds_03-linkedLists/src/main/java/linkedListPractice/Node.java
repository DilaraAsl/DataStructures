package linkedListPractice;

public class Node {
    String value;
    Node next;
    Node(String value,Node next){
        this.value=value;
        this.next=next;

    }
    Node(String value){
        this.value=value;
        this.next=null;
    }

    void printList(){
        System.out.println(value+" "+next);
    }
}
