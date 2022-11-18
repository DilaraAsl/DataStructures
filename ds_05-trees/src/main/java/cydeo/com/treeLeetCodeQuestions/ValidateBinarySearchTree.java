package cydeo.com.treeLeetCodeQuestions;

import java.util.LinkedList;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode rootNode=new TreeNode(3);

        BinarySearchTree tree=new BinarySearchTree();
        tree.root=rootNode;
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);
        tree.insert(2);
        System.out.println(isValidBST(tree.root));
    }

    public static boolean isValidBST2(TreeNode root) {
        TreeNode currentL=root;
        TreeNode currentR=root;
        if(currentL==null) return false;
        while(true){
            //check all the left nodes first
            if(currentL.left!=null){
                if(currentL.val<currentL.left.val) {return false;}
                currentL=currentL.left;
            }


            if(currentR.right!=null){
                if(currentR.val>currentR.right.val){return false;}
                currentR=currentR.right;
            }
            return true;
        }


    }
    public static boolean isValidBST(TreeNode root){
        if (root==null) return true; // it is a valid tree
        return checkIfValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }
    public static boolean checkIfValid(TreeNode currentNode,Integer min, Integer max){
        if(currentNode==null) return true;
        if(currentNode.val>max||currentNode.val<min) return false;
        return checkIfValid(currentNode.left,min,currentNode.val) && checkIfValid(currentNode.right,currentNode.val,max);


    }
}
