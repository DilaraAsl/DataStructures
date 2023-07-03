package com.kos.stringProblems;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        System.out.println(longestPalindrome(kb.nextLine()));

    }
            public static String longestPalindrome(String s) {
                int pS=0;
                int pE=s.length()-1;
                String subStr="";
                String  maxSubStr="";
                int firstIndex=0;
                int lastIndex=0;
                String tempStr="";


                while(pE>=pS&& pE<s.length()){

                    if(s.charAt(pS)==s.charAt(pE)){
                        StringBuilder sb=new StringBuilder();
                        tempStr=sb.append(s.substring(pS,pE+1)).toString();
                        if(tempStr.equals(sb.reverse().toString())){
                            // we found a substring search for a new one
                            subStr=tempStr;
                            pS++;
                            pE=s.length()-1;
                        }
                        else{

                            pE--;


                        }

                    }
                    else{
                        if(pS<pE) pE--;
                        else if(pS==pE){
                            pS++;
                            pE=s.length()-1;
                        }
                    }
                    if(maxSubStr.length()<subStr.length()){
                        maxSubStr=subStr;
                    }

                }
                return maxSubStr;

            }
        }
