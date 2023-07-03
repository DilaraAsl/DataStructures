package com.kos.maps;

import java.util.*;

public class LC_2284_SenderWithLargestWordCount {
    public static void main(String[] args) {
        String[] messages={"tP x M VC h lmD","D X XF w V","sh m Pgl","pN pa","C SL m G Pn v","K z UL B W ee","Yf yo n V U Za f np","j J sk f qr e v t","L Q cJ c J Z jp E","Be a aO","nI c Gb k Y C QS N","Yi Bts","gp No g s VR","py A S sNf","ZS H Bi De dj dsh","ep MA KI Q Ou"};
        String[] senders= {"OXlq","IFGaW","XQPeWJRszU","Gb","HArIr","Gb","FnZd","FnZd","HArIr","OXlq","IFGaW","XQPeWJRszU","EMoUs","Gb","EMoUs","EMoUs"};
        System.out.println(largestWordCount(messages,senders));
    }
    public static String largestWordCount(String[] messages, String[] senders) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0; i<messages.length; i++){
            String[] temp=messages[i].split(" "); // split the message to fine the word count
            map.put(senders[i],map.getOrDefault(senders[i],0)+temp.length);
        }
        // put them in an ordered List
        List<Map.Entry<String,Integer>> orderedList=new ArrayList(map.entrySet());
        Collections.sort(orderedList,Map.Entry.<String,Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())));
        // get the first element in the ordered list

  for(Map.Entry<String,Integer> each: orderedList){
      System.out.println(each.getKey()+" "+each.getValue());
  }
        return orderedList.get(0).getKey();
    }
}
