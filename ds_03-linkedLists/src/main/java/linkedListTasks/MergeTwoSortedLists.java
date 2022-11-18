package linkedListTasks;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);


//  while(list2!=null){
//      System.out.println(list2.val);
//      list2=list2.next;
//  }
        ListNode mergedList=new ListNode();
        ListNode current=mergedList;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }
            else {current.next=list2; list2=list2.next;}
            current=current.next;

        }

        if(list1!=null){
current.next=list1;
        list1=list1.next;}
        if(list2!=null){
            current.next=list2;
        list2=list2.next;}


        // To get rid of the first element
ListNode head=mergedList;

        head=head.next;

        mergedList=head;

        while(mergedList!=null){

    System.out.println(mergedList.val);
    mergedList=mergedList.next;
}

    }
}
