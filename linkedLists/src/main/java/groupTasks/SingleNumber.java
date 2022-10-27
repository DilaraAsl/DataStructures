package groupTasks;

import java.util.*;

public class SingleNumber {
    //Write a method that accepts a non-empty array of integers nums as parameter, every element in given array appears twice except for one. Find that single one.
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(findSingleNumber2(arr));
    }
    public static int findSingleNumber(int[] arr){
      int left=0;
      int right=arr.length-1;
      int temp=0;
      while(left!=right){
          if(arr[left]!=arr[right]){
              left++;

          }
          else {
              right--; // move the pointer
              temp=arr[left];
          arr[left]=arr[right]; // switch the value to of the new right with the left
              arr[right]=temp;// double value stored at the end of the list
              right--; // since right holds the duplicate we move the pointer to left for the new search
              left=0; // left pointer starts from the beginning
          }
      }

      return arr[left];
    }

    public static int findSingleNumber2(int[] arr){

      Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
      int left=0;
      int right=1;
      while(right<arr.length){
          if(arr[left]==arr[right])
          {  left+=2;
          right+=2;
          }
        else {
        return arr[left];}
      }
      return arr[left];



    }


}
