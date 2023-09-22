package com.kos.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class minModifications {
    public static void main(String[] args) {
     String[] arr={"ab", "aaa", "aaab", "aaacc","aaaaabbbcc"};
        System.out.println(Arrays.toString(findMinModifications(arr)));

        List<Integer> result = getMinimumModifications(arr);
        System.out.println(result);
    }
    public static int[] findMinModifications(String[] arr){
        int[] result=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            int countModifications=0;
            for(int j=0; j<arr[i].length()-1;j++) {
                if (arr[i].charAt(j) == arr[i].charAt(j+1)) {
                    countModifications++;
                    j++;
                }
            }
            result[i]=countModifications;
        }
        return result;
    }
    public static List<Integer> getMinimumModifications(String[] strings) {
        List<Integer> modifications = new ArrayList<>();

        for (String str : strings) {
            int chainLength = 0;
            int replacements = 0;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    chainLength++;
                } else {
                    replacements += chainLength / 2;
                    chainLength = 0;
                }
            }

            replacements += chainLength / 2;
            modifications.add(replacements);
        }

        return modifications;
    }

}
