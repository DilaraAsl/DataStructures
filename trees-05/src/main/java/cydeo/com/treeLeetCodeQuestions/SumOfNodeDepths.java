package cydeo.com.treeLeetCodeQuestions;

import cydeo.com.TNode;

import java.util.*;

public class SumOfNodeDepths {
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

        System.out.println(sumNodeDepth(rootNode));
    }
    public static int sumNodeDepth(TreeNode rootNode){
        List<Integer> nodeDepthList=new ArrayList<>();
        if(rootNode==null) return 0;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(rootNode);
        int i=0; int j=0;
        int qSize=1;
        int sum=0;
        Map<Integer,Integer> map=new LinkedHashMap<>();
        while(!queue.isEmpty()){

            TreeNode toVisit=queue.poll(); // remove the head of the queue returns null if empty

            qSize= queue.size();
            map.put(i++,qSize);

            if(toVisit.left!=null) {queue.add(toVisit.left);}
            if(toVisit.right!=null) {queue.add(toVisit.right);}

        }

        for (Map.Entry<Integer, Integer> set :
                map.entrySet()) {

            System.out.println(set.getKey()+" "+set.getValue());}

        return sum;
    }
}
