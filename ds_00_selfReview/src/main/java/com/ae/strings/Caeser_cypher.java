package com.ae.strings;

public class Caeser_cypher {
    public static void main(String[] args) {
        String str = "abc";
        int key=57%26;
        char[] charArray=str.toCharArray();
        int value=0;

        for(int i=0; i<charArray.length; i++){

            value=charArray[i];

            if (value+key<=122){
                charArray[i]= (char) (value+key);
            }
            else {
                charArray[i]= (char) (key-(122-value+1)+97);
            }

        }
        StringBuilder sb=new StringBuilder();

        for(char each:charArray){
            sb.append(each);
        }
        System.out.println(sb.toString());
    }
}
