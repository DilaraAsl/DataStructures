package cydeo.com.TreeReview;

public class MyTree {
    Node root;

    public void insert(int value) {
        insert(root, value); // when this method is called call the private insert method
        // to traverse the tree and to place the value
    }

    private Node insert(Node node, int value) {
        if (root == null) {
            root = new Node();
            root.val = value;
        } else if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        } ;
        return root;
    }

    public void insertValue(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }

        while (true) {
            if (value < root.val) {
                if (root.left == null) {
                    root.left = newNode;
                    break;

                } else root = root.left;
            } else {
                if (root.right == null) {
                    root.right = newNode;
                    break;

                } else root = root.right;
            }
        }
    }

    // Task 1: Find an integer value in a tree
    public boolean contains(int value) {
        if (root == null) return false;
        Node current = root;
        while (current != null) {
            if (value < current.val) current = current.left;
            else if (value > current.val) current = current.right;
            else return true;
        }

        return false;
    }

    // Task 2: Check if the node is a leaf

    public boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    // Task 3: Print leaves

    public void printLeaves(Node root) {
        if (root == null) return;

        if (isLeaf(root)) System.out.println(root.val);
        printLeaves(root.left);
        printLeaves(root.right);

    }

    // Task 4: No of leaf nodes
    public int countLeaves(Node root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    // Task 5: Find sum of Leaf Nodes
    public int findSumOfLeaves(Node root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.val;
        return findSumOfLeaves(root.left) + findSumOfLeaves(root.right);

    }
    // Task 6: Get height of a tree

    public int getHeight(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right));
    }

    public int getSum(Node root, Node current) {
        if (root == null) return -1;
        if (root.equals(current)) return 0;
        return getSum(root, root.left) + getSum(root, root.right)+1;


    }

}

