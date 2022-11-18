package cydeo.com;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {

    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;

        while (true) {
            if (value <= current.value) { // if value is less than the current place it to the left
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                // if leftChild is not null branch into left subtree
                current = current.leftChild;
            } else {

                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                // if rightChild is not null branch into right subtree

                current = current.rightChild;
            }
        }
    }

    void preOrderTraversal(TNode root){
        if (root==null) return;
        System.out.println(root.value+", ");
        inOrderTraversal(root.leftChild);
        inOrderTraversal(root.rightChild);
    }
    void inOrderTraversal(TNode root){
        if(root==null) return;

        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.leftChild);
    }

    void postOrderTraversal(TNode root){
        if(root==null) return;

        inOrderTraversal(root.leftChild);
        inOrderTraversal(root.rightChild);
        System.out.println(root.value+", ");

    }

    void levelOrderTraversal(){// level order root first then the nodes on the next depth
        if(root==null) return;

        Queue<TNode> queue=new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){

            TNode toVisit=queue.poll(); // remove the head of the queue returns null if empty
            System.out.println(toVisit.value);

            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }

    public int nodeDepthSum(TNode root, int sum){
        if(root==null) return 0;
        return sum+nodeDepthSum(root.leftChild,1)+nodeDepthSum(root.rightChild,1);



    }
    public int calculateNodeDepthSum(){
        return nodeDepthSum(root,0);
    }



}
