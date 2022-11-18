import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {
    public static void main(String[] args) {
        Deque<Integer> cstack=new LinkedList<>();
        cstack.push(1);
        cstack.push(2);
        cstack.push(5);
        cstack.push(3);
        cstack.pop();
        System.out.println(cstack.peek());
    }
}
