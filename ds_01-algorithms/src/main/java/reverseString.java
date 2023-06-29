import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s={'a','b','c'};
        System.out.println(Arrays.toString(reverseString(s)));
    }


    public static char[] reverseString(char[] s) {



        for (int i = s.length - 1, j = 0; i> (s.length - 1) / 2; i--, j++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;


        }
        return s;
    }
}

