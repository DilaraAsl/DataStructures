package cydeo.com.groupTasks.treePractice;

public class BinarySearchTree {
    Node root;
   public void insert(int value){
        insert(root,value); // recursive call
    };
    private Node insert(Node root, int value){
        if(root==null) {
            root=new Node();
            root.value = value;
        }
        else if(value<root.value){
            root.leftChild=insert(root.leftChild,value);
        }
        else if(value>root.value){
            root.rightChild=insert(root.rightChild,value);
        }
        return root; // the value is the same as the root it  returns the root
    }
}
