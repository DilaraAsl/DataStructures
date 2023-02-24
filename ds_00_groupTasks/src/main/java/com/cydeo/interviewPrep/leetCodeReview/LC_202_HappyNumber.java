package com.cydeo.interviewPrep.leetCodeReview;

import java.util.HashSet;

public class LC_202_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int num) {
      HashSet<Integer> seen=new HashSet<>();
      while(num!=1){
          int current=num;
          int sum=0;
          while(current!=0){
              sum+=(current%10)*(current%10);
              current/=10;
          }
          if(seen.contains(sum)) return false;
          seen.add(sum);
          num=sum;
      }
      return true;
    }
}