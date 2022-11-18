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
       // System.out.println(traverseBinaryTree(rootNode));
        System.out.println(calculateRangeSum(rootNode,2,5));
    }
//    public static List<Integer> traverseBinaryTree(Node root){
//        List<Integer> list=new ArrayList<>();
//        return traverse(root,list);
//    }
    public static List<Integer> traverse(Node current,List<Integer> list,int min,int max){
        if(current==null) return list;
        traverse(current.leftChild,list,min,max);
        if(current.value>=min&&current.value<=max)
        list.add(current.value);
        traverse(current.rightChild,list,min,max);
        return list;
    }
    public static int calculateRangeSum(Node root, int min, int max){
        List<Integer> list=new ArrayList<>();
        List<Integer> finalList=traverse(root,list,min,max);
        int sum=0;
       for(Integer each:finalList)
           sum+=each;
        return sum;
    }

}
