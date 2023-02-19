package com.cydeo.interviewPrep.leetCodeReview;

public class LC_1678_GoalParser {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        int pointer1=0;
        int pointer2=1;
        String newStr="";
        while(pointer1<command.length()-1 && pointer2<command.length()){
            if (command.charAt(pointer1)!='(') {newStr+=command.charAt(pointer1);pointer1++;pointer2++;}
            else{
                if(command.charAt(pointer2)!=')') pointer2++;
                else{

                    if(pointer1+1==pointer2) {newStr+="o";

                    }
                    else newStr+="al";
                    pointer2+=2;
                    pointer1=pointer2-1;
                }
            }

        }
        if(command.charAt(pointer1)=='G') newStr+="G";
        return newStr;
    }
}
