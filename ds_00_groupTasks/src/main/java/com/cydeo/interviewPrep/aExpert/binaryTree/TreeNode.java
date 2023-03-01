package com.cydeo.interviewPrep.aExpert.binaryTree;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value=value;

        this.left=null;
        this.right=null;
    }
    public void insert(int value){

        if(value==this.value) return;
        if (value<this.value)
        {   if(left==null)
            left=new TreeNode(value);
        }
        else{
            left.insert(value); // this is a recursive call to compare the value and find its place in the tree
        }
        if(value>this.value)
        {  if(right==null)
            right=new TreeNode(value);
        }
        else {
            right.insert(value);
        }
    }


}
