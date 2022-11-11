package cydeo.com.treePracticeRecursion;

public class BinarySearchTree {
    Node root;

    public void insert(int value){

        insert(this.root,value);
    }

    private Node insert(Node root, int value){ // we only want the binary search tree class to access this helper method

        if(root==null){
            root=new Node();
            root.data=value;
        }

        else if(value<root.data) {
            root.left=insert(root.left,value);

        }
        else if( value>root.data) {
            root.right = insert(root.right, value);

        }
        return root; // if the value is the same as root then return root

    }


}
