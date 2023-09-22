package com.ae.strings;

public class Run_Length_Encoding {
    public static void main(String[] args) {
        String str = "AAAAAAAAAAAAABBCCCCDD";
        System.out.println(13 % 9);
        if (str.length() <= 2)
            System.out.println(str);
        int pointer1 = 0;
        int pointer2 = 1;
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        while (pointer1 < pointer2 && pointer2 < str.length()) {
            if (str.charAt(pointer1) == str.charAt(pointer2)) {
                counter++;

            } else {
                if (counter > 9) { //20
                    while (counter / 9 != 0) {
                        int temp = counter / 9;//2
                        if (temp > 0) {
                            sb.append(9);
                            sb.append(str.charAt(pointer1));
                            counter = counter - 9; //11

                        }
                        sb.append(counter);
                        sb.append(str.charAt(pointer1));
                    }}
                    sb.append(counter);
                    sb.append(str.charAt(pointer1));
                    pointer1 = pointer2;
                    counter = 1;
                }
                pointer2++;
            }
            System.out.println(sb.toString());
        }
    }
