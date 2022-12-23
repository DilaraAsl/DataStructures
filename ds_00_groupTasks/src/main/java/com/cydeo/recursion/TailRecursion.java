package com.cydeo.recursion;

public class TailRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n, int result){
        if(n==0) return result;
        return factorial(n-1,n*result);
    }
    public static int factorial(int n){
        return factorial(n,1);
    }
}
