package groupTasks;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 2, 0, 7, 0, 8, 9};
        System.out.println(Arrays.toString(moveZeroesToEnd(nums)));
    }

    public static int[] moveZeroesToEnd(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 1;
        while (pointer1 < pointer2 && pointer2 < nums.length) {
            if (nums[pointer1] != 0) {
                pointer1++;
                pointer2++;
            } else {  // pointer1==0 then check pointer2 value
                if (nums[pointer2] == 0) {
                    pointer2++;
                } else { // swap pointer1 value with  pointer2 value
                    nums[pointer1] = nums[pointer2];
                    nums[pointer2] = 0;
                    pointer1++;
                    pointer2++;

                }

            }
        }
        return nums;
    }
}
