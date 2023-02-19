package com.cydeo.interviewPrep.dailyByte;

import java.util.Arrays;

public class db_02_palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama.";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
       s= s.replaceAll("[^a-zA-Z]+", "");
        System.out.println(s);
       s=s.toLowerCase();

        for (int i = 0, j=s.length()-1; i <s.length()/2 ; i++,j--) {
            if(s.charAt(i)!=s.charAt(j)) return false;
        }


       return true;
    }

}
