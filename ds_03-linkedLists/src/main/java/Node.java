public class Node {
    int id;
    Node nextObj; // Node object next -> holds the next address

    public Node(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", nextObj=" + nextObj +
                '}';
    }
}
