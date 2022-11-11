public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        MySinglyLinkedList myList=new MySinglyLinkedList();
        System.out.println(myList.isEmpty()); // returns true because head and all nodes are not initialized it is empty
//        myList.head=new Node(5);
//        myList.tail=new Node(12);
        for (int i = 0; i <10 ; i++) {

            myList.add(i);
        }


        myList.printNodes();
     myList.deleteById(7);
     myList.printNodes();

      //  System.out.println(myList.indexOf(8));
    }
}
