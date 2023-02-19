package com.cydeo.interviewPrep.crackingTheInterview.string_qs;

public class IsUnique {
    public static void main(String[] args) {
        String str = "aabbe";
        System.out.println(impIsUnique(str));
    }

    public static boolean isUniqueOrNot(String str) {
        // ask the interviewer if you are using an ascii character set or unicode character set
        if (str.isEmpty() || str == null) return false;
        int rPointer = 0;
        int lPointer = str.length() - 1;
        while (rPointer < lPointer) {
            while (rPointer < lPointer) {
                if (str.charAt(rPointer) == str.charAt(lPointer)) return false;
                else {
                    lPointer--;
                }

            }
            rPointer++;
            lPointer = str.length() - 1;
        }
        return true;
    }

    public static boolean impIsUnique(String str) {
        // we are assuming String is formed of ASCII Characters
        boolean[] chrs = new boolean[128];

        for (int i = 0; i < 128; i++) {

            if (chrs[str.charAt(i)]) //if that index for the character is true
            {
                return false;
            }
            chrs[str.charAt(i)] = true;// assign that index true

        }
        return true; // there is no match found
    }
}
