package cydeo.com.groupTasks.treePractice;



import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
    public static void main(String[] args) {
      Node rootNode=new Node();
        rootNode.value=5;

        BinarySearchTree tree= new BinarySearchTree();
        tree.root=rootNode;

        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(4);
        System.out.println(traverseBinaryTree(rootNode));
    }
    public static List<Integer> traverseBinaryTree(Node root){
        List<Integer> list=new ArrayList<>();
        return traverse(root,list);
    }
    public static List<Integer> traverse(Node current,List<Integer> list){
        if(current==null) return list;
        traverse(current.leftChild,list);
        list.add(current.value);
        traverse(current.rightChild,list);
        return list;
    }
}
