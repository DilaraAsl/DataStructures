package com.kos.maps;

import java.util.*;

public class LC_692_top_K_frequentWords {
    public static void main(String[] args) {
       String[] words = {"i","love","leetcode","i","love","coding"};
       int k=2;
        System.out.println(Arrays.toString(topKFrequentWords(words,k)));

    }
    public static String [] topKFrequentWords(String[] words,int k){
        // first insert the words into a map
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i <words.length ; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        // sort the map in descending and lex order
        List<Map.Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
        Collections.sort(entries, Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey()));

        String[] newList=new String[k];
        for (int i = 0; i <k ; i++) {
            newList[i]=entries.get(i).getKey();

        }
        return newList;
    }
}
