package groupTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class FrogJumpStairCaseProblem {
    public static void main(String[] args) {
        int noOfStairs=10;
      //  System.out.println(calculateStamps(noOfStairs));
       System.out.println(staircaseJumpTwoOrThree(noOfStairs));
    }
    public static int  staircaseJumpOneOrThree(int noOfStairs){
        if(noOfStairs<0) throw new NoSuchElementException("Stairs cannot be negative");
        if(noOfStairs<=2) return noOfStairs;
        int n1=1;
        int n2=1;
        int n3=2;
        int total=0;
        for (int i = 4; i <=noOfStairs ; i++) {
            total=n1+n3;
            n1=n2;
            n2=n3;
            n3=total;

        }
        return total;

    }
    public static int  staircaseJumpTwoOrThreeOrFive(int noOfStairs){
        if(noOfStairs<0) throw new NoSuchElementException("Stairs cannot be negative");
        if(noOfStairs<=2) return noOfStairs;
        int n1=0;
        int n2=1;
        int n3=1;
        int n4=1;
        int n5=3;
        int total=0;
        for (int i = 6; i <=noOfStairs ; i++) {
            total=n4+n3+n1; // n6=0+n4+n3+0+n1
            n1=n2;
            n2=n3;
            n3=n4;
            n4=n5;
            n5=total;

        }
        return total;

    }

    public static int  staircaseJumpTwoOrThree(int noOfStairs){
        if(noOfStairs<0) throw new NoSuchElementException("Stairs cannot be negative");
        if(noOfStairs<=2) return noOfStairs;
        int n1=0;
        int n2=1;
        int n3=1;
        int total=0;
        for (int i = 4; i <=noOfStairs ; i++) {
            total=n2+n1; //n4=0+n2+n1
            n1=n2;
            n2=n3;
            n3=total;

        }
        return total;

    }
    public static int calculateStairCaseJump1or3(int noOfSteps) {

        if (noOfSteps == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        map.put(3, 2);
        for (int i = 4; i <= noOfSteps; i++) {
            map.put(i, (map.get(i - 1) + map.get(i - 3)));

        }
        return map.get(noOfSteps);
    }

    public static int calculateStairCaseJump2or3(int noOfSteps) {
// N4=N2+N1
        if (noOfSteps == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 1);
        for (int i = 4; i <= noOfSteps; i++) {
            map.put(i, (map.get(i - 2) + map.get(i - 3)));

        }
        return map.get(noOfSteps);
    }
    public static int calculateStamps(int totalAmount) {

        if (totalAmount == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 4);
        map.put(4,8);
        for (int i = 5; i <= totalAmount; i++) {
            map.put(i, (map.get(i - 4) + map.get(i - 3)+(map.get(i - 2) + map.get(i - 1))));

        }
        return map.get(totalAmount);
    }
    }


