package groupTasks;




import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DeleteNnodesAfterMnodes {
    public static void main(String[] args) {
       ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        int n=2;
        int m=2;
        ListNode newHead=deleteNodesAfterM(head,n,m);
        ListNode current=newHead;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;

        }

    }
    public static ListNode deleteNodesAfterM2(ListNode head, int n, int m){

      ListNode current=head;
       ListNode prev= null;
       ListNode nextPointer=current;

        if(head!=null && m==0) {

            return head;
        }

        int counterN=n;
        int counterM=m;
        while(current!=null && m>0){
            nextPointer=current.next;
            if(counterM!=0) {


                prev=current;
                counterM--;
                //current=current.next;
                // move the current


            }
            else {
                if(counterN!=0 ){

                  counterN--;

                }


                else{
                        prev.next=current;
                       // prev=current.next;
                        current=nextPointer;

                         counterM=m;
                       counterN=n;
                }

                }

            current=current.next;

            }

        return head;
        }




    public static ListNode deleteNodesAfterM(ListNode head, int n, int m){


        ListNode current=head;
        ListNode prev=null;
        ListNode nextP=current;


        int counterN=n;
        int counterM=m;
        while(current!=null){
            if(counterM!=0) { // m steps


                counterM--;
                prev=current;
                current=current.next;


            }
            else { // n steps
                if(counterN!=0 ){
                    nextP=current.next;
                    prev.next=current.next;
                    counterN--;
                    current=nextP;

                }
                else {
             // reset the steps
                    counterM=m;
                    counterN=n;

                }

                }

            }



         return head;
        }


    }



