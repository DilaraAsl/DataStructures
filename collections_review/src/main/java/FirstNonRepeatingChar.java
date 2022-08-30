
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="Java Developer";

        System.out.println(findFirstNonRepeatingChar(str));

    }
    public static Character findFirstNonRepeatingChar(String str){
        Map<Character,Integer> strMap=new LinkedHashMap<>();
        for(Character each:str.toCharArray()){
            strMap.put(each,strMap.getOrDefault(each,0)+1);

        }

        for (Map.Entry<Character, Integer> each : strMap.entrySet()) {
            if(each.getValue()==1) return each.getKey();

        }
        return null;
    }
}
