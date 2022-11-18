package cydeo.com.treeLeetCodeQuestions;

import cydeo.com.groupTasks.treePractice.Node;

public class BinarySearchTree {
    TreeNode root;
   public void insert(int value){
        insert(root,value); // recursive call
    };
    private TreeNode insert(TreeNode root, int value){
        if(root==null) {
            root=new TreeNode();
            root.val = value;
        }
        else if(value<root.val){
            root.left=insert(root.left,value);
        }
        else if(value>root.val){
            root.right=insert(root.right,value);
        }
        return root; // the value is the same as the root it  returns the root
    }
}
