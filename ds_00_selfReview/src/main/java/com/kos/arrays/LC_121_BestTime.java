package com.kos.arrays;

public class LC_121_BestTime {
    public static void main(String[] args) {
        int[] nums={7,6,4,3,1};
        int x=Integer.MIN_VALUE;
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        // map will hold the indexes of the numbers in the array
        // return the index for minimum and maximum
        // if index of min  is greater than max search for next max
        // min cannot be the last item
        // max cannot be the first item

        int max=0;
        if(prices.length==0|| prices.length==1) return 0;

        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    max=Math.max(max,prices[j]-prices[i]);
                }
            }
        }
        return max;
    }
}
