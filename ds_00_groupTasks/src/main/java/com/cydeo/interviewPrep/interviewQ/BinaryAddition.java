package com.cydeo.interviewPrep.interviewQ;

import java.util.Stack;

public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
    public static String addBinary(String a,String b){
      StringBuilder sb=new StringBuilder();
        int pointer1=a.length()-1;
        int pointer2=b.length()-1;
        int carry=0;

        while(pointer1>=0 || pointer2>=0){ //break out of the loop when one of them comes to an end
            int sum=carry;
           if(pointer1>=0) sum+=a.charAt(pointer1)-'0'; // character value of the number
            if(pointer2>=0) sum+=b.charAt(pointer2)-'0';//
            sb.append(sum%2);
            carry=sum/2;
            pointer1--;
            pointer2--;
        }
        if(carry!=0) sb.append(carry);
       return sb.reverse().toString();

    }
}
