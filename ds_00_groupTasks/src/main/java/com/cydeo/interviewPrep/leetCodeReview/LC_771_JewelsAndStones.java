package com.cydeo.interviewPrep.leetCodeReview;

import java.util.HashMap;
import java.util.Map;

public class LC_771_JewelsAndStones {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(getNoOfJewelsInStones(jewels,stones));
    }

    public static int getNoOfJewelsInStones(String jewels, String stones){
        Map<Character,Integer> jmap=new HashMap<>();
        for(int i=0; i<stones.length(); i++){
            if(jewels.contains(stones.charAt(i)+""))
                jmap.put(stones.charAt(i),jmap.getOrDefault(stones.charAt(i),0)+1);
        }
        int total=0;
//        for(Map.Entry<Character,Integer> entry: jmap.entrySet()){
//            total+=entry.getValue();
//        }
//
//        for(Integer value: jmap.values()){
//            total+=value;
//        }

       return  jmap.values().stream().reduce(0,Integer::sum);
//      return total;
    }
}
