package com.cydeo.interviewPrep;

public class LeadingZeroes {
    public static void main(String[] args) {
        String s="P-002";
        int number=Integer.parseInt(s.substring(2));
        String formatted=String.format("P-"+"%06d",number);
        System.out.println(formatted);

    }
}
