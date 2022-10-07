public class StackDemo {
    public static void main(String[] args) {
       MyStack<Integer> sstack=new MyStack<>();
        for (int i = 0; i <5 ; i++) {

        sstack.push(i);
        }
        for(int i=0; i<5; i++){
            System.out.println(sstack.pop());
        }
    }
}
