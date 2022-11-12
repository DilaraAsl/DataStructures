package cydeo.com.groupTasks.treePractice;

public class MyTree {
    Node root;

    void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
        if(value<=current.value){
            if(current.leftChild==null){
                current.leftChild=node;
                break;
            }
            current=current.leftChild; // iterate the current to the next left child
        }
        else{
            if(current.rightChild==null){
                current.rightChild=node;
                break;
            }
            current=current.rightChild; // iterate the current to the next right child
        }
        }
    }

}
