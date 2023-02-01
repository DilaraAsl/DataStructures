package com.cydeo.interviewPrep.dailyByte;

public class db_04_CorrectCapitalization {
    public static void main(String[] args) {
        String s="Comp";
        System.out.println(checkCorrectCapitalization(s));
    }
    public static boolean checkCorrectCapitalization(String s){
        int total=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                total++;

            }
        }
        if (total==0) return true;
        if(total==1&&(s.charAt(0)>=65 &&s.charAt(0)<=90)) return true;
        if(total==s.length()) return true;
        return false;
    }
}
