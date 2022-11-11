package groupTasks;

import java.util.Arrays;

public class ProductOfArray_LeetCode238 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(findProductExceptSelf(arr)));
    }
    public static int[] findProductExceptSelf(int[] nums){
   // nums={1,2,3,4}

        int[] arr1=new int[nums.length-1];
        int[] arr2=new int[nums.length-1];
        arr1[0]=nums[0]; //1
        arr2[nums.length-2]=nums[nums.length-1]; //4
        for(int i=1;i<=nums.length-2;i++){
            arr1[i]=arr1[i-1]*nums[i];
            // 1*2,1*2*3

        }
        for(int j=nums.length-2;j>0;j--){
            arr2[j-1]=arr2[j]*nums[j];
            //4*3,4*3*2

        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        nums[0]=arr2[0]; // 4*3*2
        nums[nums.length-1]=arr1[nums.length-2];

        for(int k=1;k<nums.length-1;k++){
            nums[k]=arr1[k-1]*arr2[k]; // nums[2]=1*(4*3)
        }


        return nums;
    }
}
