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
    void deleteById(int id){
// check if empty
        if(isEmpty()) System.out.println("List is empty");
        // assign prev and current to head
        Node prev=head;
        Node current=head;
        while(current!=null){
            if(current.id==id){
                //handle case 1: head position
                if(current==head){
                    head=current.nextObj;
                    current.nextObj=null;
                }
                // case 2: tail position
                else if(current==tail)
                {
                    tail=prev;
                    prev.nextObj=null;// last obj will be eligible for garbage collection
                }

                // case 3 middle position
                else{
                    prev.nextObj=current.nextObj;
                    current.nextObj=null;
                }

                size--;// decrease the size if successful
            }
                 prev=current;
                    current=current.nextObj;

        }
    }
    void printNodes(){
        Node current=head;
        while(current!=null){
            if(current.nextObj==null) {System.out.println("null"); break;}
            System.out.print(current.id+"==>");
            current=current.nextObj;
        }
        System.out.println();
    }
//    int indexOf(int id){
//        Node current=head;
//        int counter=0;
//        if(isEmpty()) return -1;
//        while(current!=null){
//            if(current.id==id) {return counter;}
//            else current=current.nextObj;
//            counter++;
//        }
//        return -1;
//    }

}
