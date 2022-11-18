package cydeo.com.treeLeetCodeQuestions;

import cydeo.com.TNode;

import java.util.*;

public class SumOfNodeDepths {
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(10);

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;
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

        System.out.println(sumNodeDepth(rootNode));
    }

    public static int sumNodeDepth(TreeNode rootNode) {

        return 0;
    }
}