package groupTasks.phonebookLinkedList;

import linkedListsInDepth.SingleLinkedList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SingleLinkedListNode<T> {
    SingleLinkedListNode<T> next;
    SingleLinkedListNode<T> head;
    SingleLinkedListNode<T> current;
    T value;

    public boolean isEmpty(){
        if(head==null) return true;
        return false;
    }
    public void add(T obj){
        SingleLinkedListNode sln=new SingleLinkedListNode(obj);
        if(isEmpty()){

            head=sln;
            current=head;
        }
        else{
          current=current.next;

        }

    }

    public SingleLinkedListNode(T value) {
        this.value = value;
    }
}
