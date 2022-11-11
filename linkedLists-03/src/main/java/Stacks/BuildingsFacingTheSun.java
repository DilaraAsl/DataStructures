package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BuildingsFacingTheSun {
    public static void main(String[] args) {
        int[] buildings={3,5,4,4,3,1,3,2};
        Stack<Integer> stack=new Stack<>();
        for(int each:buildings){
            stack.push(each);
        }
        int smallest=stack.pop();

        StringBuilder sb=new StringBuilder();
        sb.append(buildings.length-1);// append the index of the last building


        int i=buildings.length-2;
        while (!stack.isEmpty()) {
            if(stack.peek()<=smallest){
                stack.pop();
            }
            else {
                smallest=stack.pop();// smallest gets a bigger value
                sb.append(i);
            }
         i--;

        }
        sb.reverse();
        int[] orderedArr=new int[sb.length()];
        for (int j = 0; j <sb.length() ; j++) {
            orderedArr[j]=sb.charAt(j)-48;

        }
        System.out.println(Arrays.toString(orderedArr));
    }
}
