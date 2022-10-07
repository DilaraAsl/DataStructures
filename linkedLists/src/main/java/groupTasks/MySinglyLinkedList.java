package groupTasks;

public class MySinglyLinkedList {
    Node head;
    Node tail;
int size;
    boolean isEmpty(){

        return head==null;
    }
    void add(int data){ // we are adding a new node obj with data id (Node obj constructor requires and id)
        Node node=new Node(data);
        if(isEmpty()){
            head=tail=node;
            size++;
        }
        else{ // if the node is not empty then assign the tail to the new node and increase the size of the SinglyLinkedList
            tail.nextObj=node;
            tail=node;
            size++;
        }


    }

int get(){
        Node current=head;
       return current.value;
}

    void printNodes(){
        Node current=head;
        while(current!=null){
            if(current.nextObj==null) {System.out.println("null"); break;}
            System.out.print(current.value+"==>");
            current=current.nextObj;
        }
        System.out.println();
    }


    }



