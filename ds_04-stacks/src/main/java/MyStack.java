import java.util.NoSuchElementException;

public class MyStack <T>{
    public SNode<T> bottom;// head in the linked list
    public SNode<T> top; // tail in the linked list
    int size;
    public boolean isEmpty(){
        return bottom==null; // if bottom is empty than the stack is empty
    }
    public void push(T item){
        SNode<T> sn=new SNode<>(item);
        if(isEmpty()) bottom=top=sn;
        else{
            top.next=sn;
            top=sn;
        }
        size++;
    }
    public T peek(){
        return (T)top.value; // we have to cast it to T
    }

    public T pop(){
        SNode peekNode=null;
        if(isEmpty()) throw new NoSuchElementException();
        // stack has one element
        if(top==bottom){
            peekNode=top;
            top=bottom=null;


        }
        // more than one element in the stack
        else{
            peekNode=top;
            SNode current=bottom;
            while(current.next!=top){ // find the previous value in the stack and make it top...
                current=current.next;
            }
            current.next=null;
            top=current;

    }
        size--;
        return (T) peekNode;
}

    @Override
    public String toString() {
        return "MyStack{" +
                "bottom=" + bottom +
                ", top=" + top +
                ", size=" + size +
                '}';
    }
}
