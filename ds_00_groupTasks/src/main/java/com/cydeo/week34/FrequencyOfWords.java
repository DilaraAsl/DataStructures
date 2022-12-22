package com.cydeo.week34;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String s="This is an example of example";
        System.out.println(findFrequencyOfWords(s));
        System.out.println(findFrequencyOfWordsStream(s));

        Integer[] arr={1,1,3,2,1};

    }
    public static Map<String,Integer> findFrequencyOfWords(String s){
        Map<String,Integer> frequencyMap=new HashMap<>();
        String[] arr=s.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            frequencyMap.put(arr[i],frequencyMap.getOrDefault(arr[i],0)+1);
        }
        return frequencyMap;
    }
    public static Map<String,Integer> findFrequencyOfWordsStream(String s){
        String[] arr=s.split(" ");
        Map<String,Integer> frequencyMap = Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(i->1)));

         return frequencyMap;
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here

        Map<Integer,Integer> map=arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(i->1)));
        List<Integer> list=new ArrayList<Integer>(100);
        for (int i = 0; i <= map.size(); i++) {
            for (int j = 0; j < map.get(i); j++) {
                list.add(i);
            }

        }
        return list;
    }

}
