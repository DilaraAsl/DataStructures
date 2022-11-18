package cydeo.com.treeLeetCodeQuestions;

import cydeo.com.TreeReview.Node;

import java.util.ArrayList;
import java.util.List;

public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode rootNode=new TreeNode(10);

        BinarySearchTree tree=new BinarySearchTree();
        tree.root=rootNode;
        tree.insert(6);
        tree.insert(20);
        tree.insert(4);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(3);
        tree.insert(9);
        tree.insert(29);
        tree.insert(47);
       int sum=0;
TreeNode current=rootNode;
        System.out.println(inOrderTraversal(rootNode,current));
       // List<Integer> nodeHeights = new ArrayList<>();
    //   List<Integer> nodeHeightsFinal=inOrderTraversal(rootNode,nodeHeights);
//       for(Integer each:nodeHeightsFinal){
//           sum+=each;
//       }
//        System.out.println(sum);


    }
//    public static int findMaxNodeDepth(TreeNode root){
//        if(root==null) return 0;
//        int depthL=findMaxNodeDepth(root.left);
//
//        int depthR=findMaxNodeDepth(root.right);
//
//        // if root has no children Math.max(0,0)+1
//        return Math.max(depthL,depthR)+1;
//    }
//
    public static int findLevelOfNode(TreeNode root,int key,int level){
        if(root==null) return -1; // pops out of stack
        if(root.val==key) return level; //
        int l= findLevelOfNode(root.left,key,level+1);
        if(l!=-1) return l; //we don't have the node in the tree -leaf node go back...
        return findLevelOfNode(root.right,key,level+1);
    }
//    public static int findValueNode(TreeNode root){
//        if(root==null) return 0;
//    int valueL=findValueNode(root.left);
//        System.out.println(valueL);
//   int valueR=findValueNode(root.right);
//        System.out.println(valueR);
//
//        return root.val+valueL+valueR;
//    }

//    public static int getHeight(TreeNode root,int key){
//        if(root==null) return 0;
//        if(root.left==null&&root.right==null) return 0;
//        //when it finds the node it should return the height..
//
//        if(root.val==key) {return; }
//        return level;
//
//    }

//    public static List<Integer> inOrderTraversal(TreeNode root,List<Integer> list) {
//
//        int level = 0;
//        if (root == null) return null;
//
//        inOrderTraversal(root.left, list);
//        //   sum+=getHeight(root,root.val,sum);
//        list.add(getHeight(root, root.val));
//        inOrderTraversal(root.right,list);
//return list;
//    }

    public static int getSum(TreeNode root, TreeNode current) {
        if (root == null) return -1;
        if (root.equals(current)) return 0;
        return getSum(root, root.left) + getSum(root, root.right)+1;



    }
    public static int inOrderTraversal(TreeNode root,TreeNode current) {


        if (current == null) return 0;

       // inOrderTraversal(current.left);
        //   sum+=getHeight(root,root.val,sum);
        int sum=getSum(root,current);
    //    inOrderTraversal(current.right);
return sum;
    }
    }




