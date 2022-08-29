public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(-5));
    }
    public static boolean isPrime(int num) {

        num=Math.abs(num);
        if (num==0) return false;
        if (num==1 )return false;

        for(int i=2; i<=num/2;i++){
            if (num%i==0) return false;
        }

        return true; //TODO
    }
}
