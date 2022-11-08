package groupTasks.queueTask;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1=new Stack();
    Stack<Integer> stack2=new Stack();

    public Stack<Integer> enqueue(Integer num){
        stack1.push(num);

        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());} // stack1 is empty



            return stack2;


    }
    public Integer dequeue(){
        if (stack2.isEmpty()) stack1ToStack2();
       stack2ToStack1(); // move stack2 to stack1

        Integer element=stack1.pop(); // remove the first element
       stack1ToStack2(); // update the queue

       // return element;
        return element;
    }

    public Stack<Integer> stack2ToStack1(){
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return stack1;
    }
    public Stack<Integer> stack1ToStack2(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2;
    }

    public Integer peek(){

        return stack2ToStack1().peek();// peek the last element on stack 1 which is the first element in the queue
    }

    public boolean isEmpty(){
        return stack2.isEmpty();
    }

}
