package groupTasks;

import java.util.Deque;
import java.util.LinkedList;

public class RomanNumerals {
    public static void main(String[] args) {

        System.out.println(twoPointerRomanToInteger("MCMXCIV"));

    }

    public static int romanToInteger(String romanNumeral){
        if(romanNumeral.isEmpty()|| romanNumeral==null) return 0;
        int total=0;
        Deque<Integer> stack=new LinkedList<>();
        stack.push(getRomanNumeral(romanNumeral.charAt(romanNumeral.length()-1)));
        total=getRomanNumeral(romanNumeral.charAt(romanNumeral.length()-1));
        for (int i = romanNumeral.length()-2; i>=0 ; i--) {
            if(getRomanNumeral(romanNumeral.charAt(i))<stack.peek())
                total-=getRomanNumeral(romanNumeral.charAt(i));
             else total+=getRomanNumeral(romanNumeral.charAt(i)) ;
             stack.push(getRomanNumeral(romanNumeral.charAt(i)));
        }
//        total+=getRomanNumeral(romanNumeral.charAt(0));
    return total;


    }

    public static int twoPointerRomanToInteger(String romanNumeral){
        if(romanNumeral.isEmpty()|| romanNumeral==null) return 0;
        int right=romanNumeral.length()-1;
        int left=romanNumeral.length()-2;
        int total=getRomanNumeral(romanNumeral.charAt(right));

        while(left>=0){
            if(getRomanNumeral(romanNumeral.charAt(right))>getRomanNumeral(romanNumeral.charAt(left))){ // if value right > value left subtract left
                total-=getRomanNumeral(romanNumeral.charAt(left));

            }
            else  total+=getRomanNumeral(romanNumeral.charAt(left)); // if value right <= value left add left
            right--;
            left--;
        }
        return total;

    }

    public static int getRomanNumeral(char c) {
        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;


            case 'X':
                return 10;


            case 'L':
                return 50;


            case 'C':
                return 100;


            case 'D':
                return 500;


            case 'M':
                return 1000;

            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }


    }
}
