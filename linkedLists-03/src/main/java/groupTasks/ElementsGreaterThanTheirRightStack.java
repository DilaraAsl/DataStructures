package groupTasks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ElementsGreaterThanTheirRightStack {
    public static void main(String[] args) {
        int[] arr={10,4,6,3,5};
        printAllGreaterThanRight(arr);
    }
    public static void printAllGreaterThanRight(int[] nums){
        if(nums==null || nums.length==0) return;
        Deque<Integer> stack=new LinkedList<>();
        stack.push(nums[nums.length-1]);

        for(int i=nums.length-2;i>=0;i--){
           if ( stack.peek()<nums[i]){
               stack.push(nums[i]);
           }

        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
