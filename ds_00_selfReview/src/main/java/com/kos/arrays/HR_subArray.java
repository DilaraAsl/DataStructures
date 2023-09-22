package com.kos.arrays;

import javax.swing.text.JTextComponent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HR_subArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // find the negative subsets in the array
        // find substrings including the negative subsets
        Scanner kb=new Scanner(System.in);
        int count=kb.nextInt();
        int counter=0;
        ArrayList<Integer> numList=new ArrayList<>();
        Set<String> set=new HashSet<>();
        while(counter<count){
            int n=kb.nextInt();
            numList.add(n);
            counter++;

        }

        int pointer1=0;
        int pointer2=0;
        while(pointer2<numList.size()&& pointer1<=pointer2){
            if(numList.get(pointer2)>=0){ // pointer2 is positive
                pointer2++;
            }
            else{ // pointer2 is at a negative number
                //add the subset to the set
                while(pointer1<=pointer2){ //check all the possible negative substrings on the left and add them to a set
                    if(numList.get(pointer1)+numList.get(pointer2)<0) {
                        set.add(pointer1+":"+pointer2);

                    }
                     pointer1++;
                }
                pointer1=pointer2; // bring pointer1 to pointer2 position
                pointer2++;// begin searching right
                // all the negative substrings searched on the left
                while(pointer2<numList.size()){ // check the right substrings
                    if(numList.get(pointer1)+numList.get(pointer2)<0){set.add(pointer1+":"+pointer2);}
                     pointer2++;
                }
                pointer2=pointer1+1; // bring back pointer2 to next to pointer 1
            }
        }

        for(String each:set){
            System.out.println(each);
        }
        System.out.println(set.size());
    }
}
