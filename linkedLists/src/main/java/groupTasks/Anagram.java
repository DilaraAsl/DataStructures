package groupTasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="!rat";
        String str2="tar!";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;

        }
        return true;

    }


//        String mergedString=str1+str2;
//
//
//        int result=0;
//
//        for (int i = 0; i < mergedString.length(); i++) {
//            result^=mergedString.charAt(i); // xor if match found the result will be 0
//
//        }
//        if(result!=0) return false;

 //   }
}
