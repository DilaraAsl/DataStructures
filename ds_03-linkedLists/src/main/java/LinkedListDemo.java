import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1=new Node(1);
      //  System.out.println("Next address is "+node1.nextObj);// nothing is assigned it is null
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);

        node1.nextObj=node2;

        node2.nextObj=node3;
        node3.nextObj=node4;
        System.out.println("Next address is "+node1.nextObj);
        System.out.println("Next address is "+node2.nextObj);
        System.out.println("Next address is "+node3.nextObj);
        System.out.println("Next address is "+node4.nextObj);
        Node current;
        Node head=node1;
        current=head;// current is assigned to head
        while(current!=null){
            System.out.println(current.id);
            current=current.nextObj; // current is assigned to the next object
        }
     ArrayList<Node> nodeArrayList=new ArrayList<>(Arrays.asList(new Node(5),new Node(6),new Node(7),new Node(8)));


    }

}
