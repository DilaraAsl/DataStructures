package groupTasks;

import java.util.HashMap;
import java.util.Map;

public class StaircaseRecursionTask {
    public static void main(String[] args) {
        int noOfSteps = 8;

        System.out.println(calculateStairCaseJump1(noOfSteps));
    }


    public static int calculateStairCaseJump1(int noOfSteps) {
        if (noOfSteps == 0) return 0;
        if (noOfSteps == 1) return 1;
        if (noOfSteps == 2) return 2;
        if (noOfSteps == 3) return 4;
        return calculateStairCaseJump1(noOfSteps - 1) + calculateStairCaseJump1(noOfSteps - 2) + calculateStairCaseJump1(noOfSteps - 3);


    }

    public static int calculateStairCaseJump2(int noOfSteps) {

        if (noOfSteps == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 4);
        for (int i = 4; i <= noOfSteps; i++) {
            map.put(i, (map.get(i - 3) + map.get(i - 2) + map.get(i - 1)));

        }
        return map.get(noOfSteps);
    }

    public static int calculateStairCaseJump3(int noOfSteps) {
        if (noOfSteps == 0) return 0;
        if (noOfSteps == 1) return 1;
        if (noOfSteps == 2) return 2;
        if (noOfSteps == 3) return 4;
        int result = 0;
        for (int i = 4; i <= noOfSteps; i++) {
            result += calculateStairCaseJump3(i - 3) + calculateStairCaseJump3(i - 2) + calculateStairCaseJump3(i - 1);

        }
        return result;
    }
}
