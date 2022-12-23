package com.cydeo.interviewPrep;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(calcSum(111134));
    }

    static int calcSum(int n){
      //  int remainder=n%10;


        return n>=10?calcSum(n/10+n%10):n;
    }
}
