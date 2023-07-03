package com.kos.maps;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LC_451_SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

        public static String frequencySort(String s) {
            char[] chars=s.toCharArray();
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0; i<chars.length; i++){
                map.put(chars[i],map.getOrDefault(chars[i],0)+1);
            }
//            String resultString=map.entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue())
//                    .map(Map.Entry::getKey)
//                    .map(Object::toString)
//                    .collect(Collectors.joining());
            List<Map.Entry<Character,Integer>> entries=new ArrayList<>(map.entrySet());
//            Collections.sort(entries,Map.Entry.comparingByValue(Comparator.reverseOrder()));
            Collections.sort(entries,Map.Entry.comparingByValue(Comparator.reverseOrder()));
            String resultString="";
            for(Map.Entry<Character,Integer> entry:entries){
                for(int i=0;i<entry.getValue();i++){
                    resultString+=entry.getKey();
                }
            }
return resultString;
        }
    }

