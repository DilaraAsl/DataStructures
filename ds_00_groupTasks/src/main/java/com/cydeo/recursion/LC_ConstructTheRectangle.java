package com.cydeo.recursion;

import java.util.Arrays;

public class LC_ConstructTheRectangle {
    public static void main(String[] args) {
        int[] ans = constructRectangle(4);

        System.out.println(ans[0] + ", " + ans[1]);
        System.out.println(Arrays.toString(constructRectangle(4)));
    }

//    public static int[] constructRectangle(int area) {
//
//        // area must be equal to target
//        //L>=W
//        // L-W shoulb be small as possible
//        return findMatch(37);
//
//    }

    public static int[] findMatchRecursion(int l, int w, int area, int smallest) {
        if (l * w == area) {
            if (l >= w && (l - w) < smallest) {
                smallest = l - w;
                int[] arr = {l, w};
                return arr;
            }

        }
        l++;
        w = area / l;
        return findMatchRecursion(l, w, area, smallest);
    }

    public static int[] findMatch(int area) {
        double l = Math.sqrt(area * 1.0);
        double w = area / l;

        if ((int) l * (int) w == area) {
            if (l > w) return new int[]{(int) l, (int) w};
            return new int[]{(int) w, (int) l};
        }
        return findMatchRecursion(1, area, area, area);
    }

        public static int[] constructRectangle(int area) {
            int[] ans = {area, 1};
            for(int i=1;i*i<=area;i++){
                if(area%i == 0 && (area/i - i)<(ans[0] - ans[1])){
                    ans[0] = area/i;
                    ans[1] = i;
                }
            }
            return ans;
        }
    public int[] constructRectangle2(int area) {
        int[] result = new int[2];
        int l=1,w,dif=Integer.MAX_VALUE;
        while(l<=area){
            w=area/l;
            if(l>=w && area%l==0 &&l-w<=dif){
                result[0]=l;
                result[1]=w;
                dif=l-w;
            }
            l++;
        }
        return result;
    }



}
