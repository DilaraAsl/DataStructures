package com.cydeo.interviewPrep.leetCodeReview;

import java.util.Arrays;

public class LeetCode_2114_MaxNoOfWordsSentence {
    public static void main(String[] args) {
        String[] strs={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(findMaxOfWords(strs));
    }

    public static int findMaxOfWords(String[] sentences){
//        Arrays.sort(strs,(a,b)->Integer.compare(a.length(),b.length()));

        int max=0;
        System.out.println(max);
        for(String each: sentences){
            String[] str=each.split(" ");
            System.out.println(Arrays.toString(str));
            if(max<str.length){
                max=str.length;
                System.out.println(max);
            }
        }
        return max;
    }
}
