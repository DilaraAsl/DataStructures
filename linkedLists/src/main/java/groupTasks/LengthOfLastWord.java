package groupTasks;

import java.util.Stack;
import java.util.stream.IntStream;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="fly me to the moon     ";
        System.out.println(getLengthOfLastWord(str));
    }
    public static int getLengthOfLastWord(String str){

        int size=0;
        int i=str.length()-1;

        while(str.charAt(i)==' ' && i>=0) i--; // check the spaces at the end of the string & move the pointer

        while(i>=0)  {
            if(str.charAt(i)!=' ') {size ++;i--;}
        else break;

        }

        return size;

    }

    public static int getLenghtOfLastWord2(String str){

            return (int) IntStream.iterate(str.length() - 1, i -> i >= 0, i -> --i).map(str::charAt).dropWhile(ch -> !Character.isLetter(ch)).takeWhile(Character::isLetter).count();}

}
