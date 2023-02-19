package com.cydeo.interviewPrep.leetCodeReview;

public class LC_1108_DefangingIPAddress {
    public static void main(String[] args) {
        String s="1.1.1.1";

        s=s.replaceAll("[^0-9]+","[.]");
        System.out.println(s);


    }
}
