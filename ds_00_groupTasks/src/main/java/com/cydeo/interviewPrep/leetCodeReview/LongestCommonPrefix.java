package com.cydeo.interviewPrep.leetCodeReview;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strList={"flower","flow","flight"};
        System.out.println(findLongestCommonPrefix(strList));
    }

    public static String findLongestCommonPrefix(String[] strList){
        //sort the list so that we can check the first and last string for the common prefix
        Arrays.sort(strList);
        String commonPrefix="";
        //edge cases
        if(strList.length==1) return strList[0];
        if(strList[0].isEmpty()||strList[0].isBlank()) return commonPrefix;
        // find the shorter string length
        int minLength=Math.min(strList[0].length(),strList[strList.length-1].length());
        for (int i = 0; i <minLength ; i++) { //no of strs in a list
            if(strList[0].charAt(i)!=strList[strList.length-1].charAt(i)) break;
            else commonPrefix+=strList[0].charAt(i);
        }
        return commonPrefix;
    }
}
