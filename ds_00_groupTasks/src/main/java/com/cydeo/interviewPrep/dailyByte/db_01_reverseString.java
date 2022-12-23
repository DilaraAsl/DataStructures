package com.cydeo.interviewPrep.dailyByte;

public class db_01_reverseString {
    public static void main(String[] args) {
        String s="The Daily Byte";
        if(s.isEmpty()||s.equals(null)) return ;
        String newS="";
        for (int i =s.length()-1; i >=0 ; i--) {
            newS+=s.charAt(i);

        }
        System.out.println(newS);
    }
}
