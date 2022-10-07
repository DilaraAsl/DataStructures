package LinkedListKthElement;
public class Node {
    int id;

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", next=" + next +
                '}';
    }

    Node next;
    public Node(int id){
        this.id=id;
    }
}
