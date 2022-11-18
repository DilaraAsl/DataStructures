package twoPointerTechnique;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] solution=new int[2];

        int i=0;
        int j=nums.length-1;
        int sum=0;

            while(j>i){
                sum=nums[i]+nums[j];
                if(sum==target){
                    solution[0]=i;
                    solution[1]=j;break;
                }
                else if(sum<target){
                    i++;
                }
                else j--;
            }


        return solution;
        }

    }

