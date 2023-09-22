package com.kos.arrays;

public class flipString_JP {
    public static void main(String[] args) {
        String target = "10110";

        System.out.println(findNoOfFlips(target));
    }

    public static int findNoOfFlips(String target) {
        //task is to start String "00000" and reach the target String by flipping the numbers from 0 to 1 or vice verse
        char[] targetArr = target.toCharArray(); // convert the String to a char array
        char[] startingArr = {0, 0, 0, 0, 0}; // we start with a String "00000" initialized with 0's
        String result = "";
        int noOfFlips = 0;
        int index = 0;

        while (index < startingArr.length) {
            // start from the array where we see 1 flip the
            if (startingArr[index] != targetArr[index]) {
                // flip the numbers
                startingArr[index] = targetArr[index];

                // flip the rest of the numbers to the right

                for (int i = index + 1; i < startingArr.length; i++) {
                    startingArr[i] = startingArr[i] == '0' ? '1' : '0';
                }
                noOfFlips++;
            }
            index++;
        }
        return noOfFlips;
    }

}

