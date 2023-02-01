package com.cydeo.interviewPrep.leetCodeReview;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int num){
        String numStr=String.valueOf(num);
        for (int i = 0; i <numStr.length()/2 ; i++) {
            if(numStr.charAt(i)!=numStr.charAt(numStr.length()-i-1))
                return false;

        }
        return true;
    }
}
