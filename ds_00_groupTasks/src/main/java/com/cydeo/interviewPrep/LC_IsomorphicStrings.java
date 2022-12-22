package com.cydeo.interviewPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LC_IsomorphicStrings {
    public static void main(String[] args) {
        String s1="egg";
        String s2="add";
        System.out.println( checkIfIsomorphic(s1,s2));

    }
    public static boolean checkIfIsomorphic(String s1,String s2){
        if (s1.length()!=s2.length()) return false;
        Map<Character,Character> map=new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
            if(!map.containsKey(s1.charAt(i))&&!map.containsKey(s2.charAt(i))){
                map.put(s1.charAt(i),s2.charAt(i));
            }
            else if(!map.get(s2.charAt(i)).equals(s1.charAt(i))) return false;
            else if(!map.get(s1.charAt(i)).equals(s2.charAt(i))) return false;

        }

        return true;

    }
}
