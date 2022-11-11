public class SLinkedList {
    protected SNode head;
    protected long size;
    protected SNode tail;
    protected SNode current;

    public SLinkedList() {
        head = tail = null;

        size = 0;
    }

    public boolean isEmpty(SNode n) {
        if (n == null) return true;
        return false;
    }

    public void add(SNode n) {
        if (!isEmpty(n)) {
            tail.setNext(n); // current tail's next reference set to n
            tail = n; // set tail to n
            size++;


        }
//    public void addFirst(SNode n){
//        n.setNext(head); // next field of n set to the head reference
//        head=n; // new head is set to n
//        size++; // size is increased
//    }
//    public void addLast(SNode n){
//
//    }
    }
}