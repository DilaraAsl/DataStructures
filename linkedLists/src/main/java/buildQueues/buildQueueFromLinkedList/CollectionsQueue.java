package buildQueues.buildQueueFromLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        // enqueue:when we are adding a new element to the queue it is always at the end, so we are adding the element in tail
        // dequeue: we will remove the head since queue is a first in first out structure
  MyQueue <Integer> nq=new MyQueue<>();
  nq.enqueue(1);
  nq.enqueue(2);
        System.out.println(nq.dequeue());

        Queue<Integer> cq=new LinkedList<>();
        cq.add(1);

    }
}
