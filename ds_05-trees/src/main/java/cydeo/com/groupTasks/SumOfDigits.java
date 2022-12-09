package cydeo.com.groupTasks;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=132189;
       int result=findSumOfDigits(num);
        System.out.println(findSumOfDigits(num));
        //System.out.println(findSumOfDigits(findSumOfDigits(num)));
    }
    public static int findSumOfDigits(int num){
       if(num==0) return 0;

      int remainder=num%10;
    int result=findSumOfDigits(num/10)+remainder;


    return result>10?findSumOfDigits(result):result;
    }
}
