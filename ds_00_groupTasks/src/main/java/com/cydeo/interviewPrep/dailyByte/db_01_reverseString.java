package com.cydeo.interviewPrep.dailyByte;

public class db_01_reverseString {
    public static void main(String[] args) {
        String s="The Daily Byte";
        if(s.isEmpty()||s.equals(null)) return ;
        String newS="";
        for (int i =s.length()-1; i >=0 ; i--) {
            newS+=s.charAt(i);
        }
        System.out.println(newS);
//  it’s not very performant due to strings being immutable in Java
//  (immutable is just a scary word that means cannot be changed).
//  Because strings are immutable, every time we add a new character to the string
//  an entirely new copy of that string is made containing the new character.
        System.out.println(reverse(s));
    }

    public static  String reverse(String s){

        // we can improve our solution by first initializing a buffer to hold our reversed string
        // before returning the result.
        char[] characters=new char[s.length()];
        int index=0;
        for (int i = s.length()-1; i>=0; i--) {
            characters[index++]=s.charAt(i);
        }
        return new String(characters);
    }

}
