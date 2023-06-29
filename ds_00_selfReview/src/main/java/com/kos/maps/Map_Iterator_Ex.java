package com.kos.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Map_Iterator_Ex {
    public static void main(String[] args) {
        TreeMap<String, Integer> encode = new TreeMap<>();
        encode.put("M", 212);
        encode.put("A", 193);
        encode.put("T", 227);

        Iterator<Map.Entry<String, Integer>> it;
        it = encode.entrySet().iterator();
        System.out.println(it.next().getValue());
    }
}
