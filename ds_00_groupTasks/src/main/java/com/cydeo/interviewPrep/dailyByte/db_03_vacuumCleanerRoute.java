package com.cydeo.interviewPrep.dailyByte;

public class db_03_vacuumCleanerRoute {
    public static void main(String[] args) {
        String s="LRDULRDULRDU";
        System.out.println(checkIfRouteCompleted(s));
    }
    public static boolean checkIfRouteCompleted_1(String s){
//        Bitwise XOR (exclusive or) "^" is an operator in Java
//        that provides the answer '1' if both of the bits in its operands are different,
//        if both of the bits are same then the XOR operator gives the result '0'.
//        XOR is a binary operator that is evaluated from left to right.

        int route=0;
        boolean r=false;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='L')s=s.replace('L','R');// replace returns a string;
            if(s.charAt(i)=='D')s=s.replace('U','D');
            System.out.println(s);
            route^=s.charAt(i);


        }
        System.out.println(route); // prints the ascii value of the character that has no match
        if(route==0)return true;
        return false;

        // space 0(1) time O(n^2)
    }
    public static boolean checkIfRouteCompleted1(String s){
        char[] temp=new char[s.length()];
        int route=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='L') temp[i]='R';
            else if(s.charAt(i)=='D')temp[i]='U';
             else
            temp[i]=s.charAt(i);
            route^=temp[i];
        }
        System.out.println(route); // prints the ascii value of the character that has no match
        if(route==0)return true;
        return false;
        }

        //space O(n) O(n)



    public static boolean checkIfRouteCompleted(String s){

        int route=0;
        for (int i = 0; i <s.length() ; i++) {

            route^=s.charAt(i);
        }
        System.out.println(route); // prints the ascii value of the character that has no match
        if(route==0|| route==15)return true;
        return false;

        //space o(1) time o(n)
    }
    public static boolean vacuumReturnsToStart(String moves) {
        int UD = 0;
        int LR = 0;
        for(int i = 0; i < moves.length(); i++) {
            char current = moves.charAt(i);
            if(current == 'U') {
                UD++;
            } else if(current == 'D') {
                UD--;
            } else if(current == 'L') {
                LR++;
            } else if(current == 'R') {
                LR--;
            }
        }

        return UD == 0 && LR == 0;
    }
    }


