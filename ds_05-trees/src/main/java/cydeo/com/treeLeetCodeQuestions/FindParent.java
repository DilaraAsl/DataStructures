package cydeo.com.treeLeetCodeQuestions;

public class FindParent {
    public static void main(String []args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int node = 5;

        findParent(root, node, -1);
    }



    // Recursive function to find the
// parent of the given node
     public static void findParent(TreeNode node,
                           int val, int parent)
    {
        if (node == null)
            return;

        // If current node is the required node
        if (node.val== val)
        {

            // Print its parent
            System.out.print(parent);
        }
        else
        {

            // Recursive calls for the children
            // of the current node
            // Current node is now the new parent
            findParent(node.left, val, node.val);
            findParent(node.right, val, node.val);
        }
    }



}
