package cydeo.com.treePracticeRecursion;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        Node rootNode=new Node();
        rootNode.data=2;

        BinarySearchTree tree= new BinarySearchTree();
       tree.root=rootNode;

       tree.insert(3);
       tree.insert(1);
       tree.insert(6);
    }
}
