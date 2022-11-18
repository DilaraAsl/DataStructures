import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int target=15;
        int[] nums={2,7,5,10};
        System.out.println(Arrays.toString(findTwoSum(nums,target)));

    }
    public static int[] findTwoSum(int[] nums,int target){
        Map<Integer,Integer> numMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i],i);

        }
        for (int i = 0; i < nums.length; i++) {
            if(numMap.containsKey(target-nums[i])) // if map contains the difference between target and current no we found a match
                return new int[]{i,numMap.get(target-nums[i])};

        }
        return new int[]{0,0};
    }
}
