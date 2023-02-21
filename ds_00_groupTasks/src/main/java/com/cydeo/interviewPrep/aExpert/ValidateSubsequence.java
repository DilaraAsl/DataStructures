package com.cydeo.interviewPrep.aExpert;
import java.util.*;
public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>(Arrays.asList(1,5,2,-1,8,6));
        List<Integer> sequence=new ArrayList<>(Arrays.asList(1,-1,5));

        System.out.println(isValidSubsequence2( array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.

        if(sequence.size()==1 && array.contains(sequence.get(0))) return true;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <sequence.size() ; i++) {
            for (int j = 0; j <array.size() ; j++) {
                if(sequence.get(i)==array.get(j)){
                    list.add(j); break;
                }

            }

        }

        List<Integer> unSortedList=new ArrayList(list);

        Collections.sort(list);

        if(unSortedList.equals(list)) return true;
        return false;
    }
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        boolean[] arr=new boolean[sequence.size()];
        int pointerA=0;
        int pointerS=0;

        while(pointerS<sequence.size()&&pointerA<array.size()){
            if(array.get(pointerA)==sequence.get(pointerS)) {arr[pointerS]=true; pointerS++;pointerA++;}
            else pointerA++;
        }
     if(arr[sequence.size()-1]==false) return false;

        return true;
    }
}
