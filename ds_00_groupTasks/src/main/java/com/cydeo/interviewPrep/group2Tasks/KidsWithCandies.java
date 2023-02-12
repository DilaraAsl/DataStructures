package com.cydeo.interviewPrep.group2Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {


    public static void main(String[] args) {
        int[] candies = {4,2,1,8,2};
        System.out.println(kidsWithCandies(candies,5));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> kidsWhoHaveMostCandyList=new ArrayList<>();
    if (candies.length==1) {kidsWhoHaveMostCandyList.add(true); return kidsWhoHaveMostCandyList;}

        int max = candies[0];
    //find maximum no in the array
        for (int i = 1; i <candies.length ; i++) {
            max=Math.max(max, candies[i]);

        }

        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]+extraCandies>=max) kidsWhoHaveMostCandyList.add(true);
            else kidsWhoHaveMostCandyList.add(false);

        }
         return kidsWhoHaveMostCandyList;
        }
    }
