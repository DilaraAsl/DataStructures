package com.kos.stringProblems;

import java.util.Scanner;

public class LongestSubstringNoRepetition {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println(lengthOfLongestSubstring(kb.nextLine()));

    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int maxL = 0;
        int pstart = 0;
        int pend = 0;
        String newStr = "";
        String maxStr = "";


        while (pend < s.length() && pstart <= pend) {
            if (newStr.contains("" + s.charAt(pend))) {
                // place the pointer next to the  index where the repeated character is seen
                pend = newStr.indexOf(s.charAt(pend)) + 1;

                //trim the string
                s = s.substring(pend);
                //we are trimming the String we need to reset the pointers
                pend = 0;
                pstart = 0;
                newStr = "";


                pstart = pend;
            } else {
                newStr += s.charAt(pend);
                pend++;
            }
            // keep track of the maxStr
            if (maxStr.length() < newStr.length()) {
                maxStr = newStr;
            }


        }
        System.out.println(maxStr);
        return maxStr.length();
    }

}
