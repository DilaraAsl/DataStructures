package linkedListsInDepth;

public class SingleLinkedListTester {
    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.add(new Node(32));
        sll.add(new Node(25));
        sll.add(new Node(11)); sll.add(new Node(81));
        sll.printNodes();
        System.out.println("-------------------------------------");

        System.out.println(sll.getNth(2));
        System.out.println("------------------------------------------");
//      sll.deleteList();
//     sll.printNodes();
        System.out.println("Pop the last node:");
        sll.pop();

        System.out.println("print all the nodes: ");
        sll.printNodes();
        System.out.println("--------------------------------------------");
        sll.insertNth(3,44);
        sll.printNodes();
    }
}
