package groupTasks.queueTask;

import groupTasks.queueTask.MyQueue;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2); System.out.println(q.dequeue()); q.enqueue(7);

q.enqueue(4); System.out.println(q.isEmpty());
q.enqueue(5);
System.out.println(q.dequeue()); q.enqueue(6); System.out.println(q.peek());


    }

}
