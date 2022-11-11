package groupTasks;

public class Node {
    int value;
    Node nextObj; // Node object next -> holds the next address

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextObj=" + nextObj +
                '}';
    }
}
