package com.cydeo.interviewPrep.dailyByte;

public class db_03_vacuumCleanerRoute {
    public static void main(String[] args) {
        String s="URURD";
        System.out.println(checkIfRouteCompleted(s));
    }
    public static boolean checkIfRouteCompleted(String s){
//        Bitwise XOR (exclusive or) "^" is an operator in Java
//        that provides the answer '1' if both of the bits in its operands are different,
//        if both of the bits are same then the XOR operator gives the result '0'.
//        XOR is a binary operator that is evaluated from left to right.
        int route=0;
        boolean r=false;
        for (int i = 0; i <s.length() ; i++) {
            route^=s.charAt(i);


        }
        System.out.println(route); // prints the ascii value of the character that has no match
        if(route==0)return true;
        return false;
    }
}
