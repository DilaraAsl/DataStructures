package cydeo.com.groupTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        // System.out.println(getMissingNumber(arr));
        System.out.println(getBestTimeToBuyAndSell(arr));
    }

    public static int getMissingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((i) != nums[i]) return i;
        }
        return nums.length;
    }

    public static int getBestTimeToBuyAndSell(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int profit = 0;
        int maxProfit = 0;
        for (int i = 1; i < nums.length; i++) {
            if (stack.peek() < nums[i]) { // if the next no is greater then calculate the profit
                profit = nums[i] - stack.peek();
            } else {
                stack.pop(); // if the no is smaller than pop the prev and push the smaller
                stack.push(nums[i]);
            }
            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }
        return maxProfit;
    }
}