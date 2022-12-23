package com.cydeo.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        move(4,'A','C','B');
    }

    public static void move(int disks, char from, char to, char using) {
        if(disks==1) {
            System.out.println("Moving disk 1 from "+from+" to "+to);
        }
        else {
            move(disks - 1, from, using, to);
            System.out.println("Moving disk " + disks + " from " + from + " to " + to);
            move(disks - 1, using, to, from);
        }
    }

}