package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class BuildingsFacingTheSunWest {
    public static void main(String[] args) {
        int[] buildings={3,5,4,4,3,1,3,2};
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int biggest=buildings[0];
        sb.append(0);
       stack.push(biggest);

int i=1;

        while(i<buildings.length){
            if(stack.peek()<buildings[i]){
                stack.push(buildings[i]);
                sb.append(i);
            }
            i++;
        }
        int[] buildingIndexes=new int[sb.length()];
        for (int j = 0; j <sb.length() ; j++) {
            buildingIndexes[j]=sb.charAt(j)-48;

        }

        System.out.println(Arrays.toString(buildingIndexes));
    }
}
