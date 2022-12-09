package cydeo.com.treeLeetCodeQuestions;


import cydeo.com.groupTasks.treePractice.Node;

import java.util.List;

public class LCAncestor {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(6);

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(2);
        tree.insert(8);
        tree.insert(0);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);

          }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null) return null;
        if(p.val>=q.val) return p;
        if(p.val<root.val&&q.val<root.val){ // if both are smaller than the root is on the left
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val&&q.val>root.val){ // if both are larger than the root is on the right
            return lowestCommonAncestor(root.right,p,q);
        }


      return root; // if one is on the left the other on the right return the root
    }


}
