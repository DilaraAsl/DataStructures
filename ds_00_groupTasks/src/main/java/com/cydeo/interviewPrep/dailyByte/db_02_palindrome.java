package com.cydeo.interviewPrep.dailyByte;

import java.util.Arrays;

public class db_02_palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama.";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        s.replace(" ","");
        String[] arr=s.split("[/w] ");
        System.out.println(Arrays.toString(arr));

       return true;
    }
}
