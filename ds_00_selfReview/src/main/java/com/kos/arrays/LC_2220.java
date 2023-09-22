package com.kos.arrays;

public class LC_2220 {
    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }
    public static int minBitFlips(int start, int goal) {
        if(start == goal) return 0;
        int xor = start ^ goal;
        int counter=0;
        // xor>0 did not flip all the digits yet
        while(xor > 0) {
            xor = xor & (xor-1);
            counter++;
        }
        return counter;
    }

}
