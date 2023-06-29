package com.cydeo.recursion;

public class CodingBat_Code8 {
    public static void main(String[] args) {
        System.out.println(count8(881));
    }
    public static int count8(int n) {
        int occurance=0;
        if(n<10 && n==8 && occurance==0) {occurance+=1; return 1;}
        else if(n<10 && n==8 && occurance!=0) {return occurance*=2;}
        else if(n<10 && n!=8) {occurance=0; return 0;}
        return count8(n/10)+count8(n%8);

    }
}
