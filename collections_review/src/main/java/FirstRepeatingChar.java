import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "Java Developer";


        System.out.println(firstRepeatingChar(str));


    }

    public static Character firstRepeatingChar(String str) {
        Set<Character> strSet = new HashSet<>(); // space complexity of O(n)
        for (Character each : str.toCharArray()) {
            if (!strSet.add(each)) return each;}

 //  for (int i = 0; i < strArr.length; i++) {
//            if (strSet.add(strArr[i])==true);// if there is a repeated element in a set the strSet will be false
//            else {System.out.println(strArr[i]);break;}
//
//        }


        return null;
    }
}
