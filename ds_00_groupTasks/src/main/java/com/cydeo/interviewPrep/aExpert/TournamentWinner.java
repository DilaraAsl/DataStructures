package com.cydeo.interviewPrep.aExpert;

import java.util.*;

public class TournamentWinner {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>(Arrays.asList("H","C"));
        ArrayList<String> arr2=new ArrayList<>(Arrays.asList("C","P"));
        ArrayList<String> arr3=new ArrayList<>(Arrays.asList("P","H"));
   //     ArrayList<ArrayList<String>> competitions=new ArrayList<>(Arrays.asList(arr1,arr2,arr3));
        ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(arr1, arr2, arr3));

        ArrayList<Integer> results=new ArrayList<>(Arrays.asList(0,0,1));
        System.out.println(competitions.get(0).get(0));
        System.out.println(competitions.get(0).get(1));
        System.out.println(tournamentWinner(competitions,results));

    }
    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.

        Map<String, Integer> scores=new HashMap<String,Integer>();

        for(int i=0;i<results.size();i++){
            if(results.get(i)==1){
                System.out.println(competitions.get(i).get(0));
                scores.put( competitions.get(i).get(0),scores.getOrDefault(competitions.get(i).get(0),0)+3);
            }
            else{
                System.out.println( competitions.get(i).get(1));
                scores.put( competitions.get(i).get(1),scores.getOrDefault(competitions.get(i).get(1),0)+3);}
        }

        String team=Collections.max(scores.entrySet(),Comparator.comparingInt(Map.Entry::getValue)).getKey();

        return team+" "+scores.get(team);

    }

}
