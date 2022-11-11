package groupTasks;

public class RepeatingElementsXOR {
    public static void main(String[] args) {
        int[] arr={1,2,2,2};
        System.out.println(withXOR(arr));
    }
 /*
    Bit Manipulation (XOR)
    Concept :
XOR of zero and some bit returns that bit i.e. x^0 = x...
XOR of two same bits returns 0 i.e. x^x = 0...
And, x^y^x = (x^x)^y = 0^y = y...
XOR all bits together to find the unique number.

-If we use XOR operator between two same values, it will return zero.
-If one of the value is zero, and the other is non-zero, it returns the non-zero value.

XOR
X^X = 0
0^X = X

Let's see some rules:
0^A=A
A^A=0
A^B^A=B
(A^A^B) = (B^A^A) = (A^B^A) = B This shows that position doesn't matter.
Similarly , if we see , A^A^A.. with (even times)=0 and A^A^A.. with (odd times)=A

We apply the above observations :

Because, the elements with frequency=2 will result in 0. And then the only element with frequency=1 will generate the answer.

Our array is : {4,1,2,1,2}
4^1
4^1^2
4^1^2^1 ->[1^1=0]
4^2
4^2^2 -> [2^2=0]
4
So, the element which we got as left should be our answer, so the answer is '4'
     */

    //Time complexity: O(n), Space complexity: O(1)

  static  int duplicateNumber(int[] arr){
       int value=0;


        for(int each: arr){
        value=value^each;

        }
        return value;
    }
    static int withXOR(int[] nums) {
        int result = 0;
        for (int i : nums) {
            // Concept of XOR...
            result ^= i;
        }
        return result;
    }


}
