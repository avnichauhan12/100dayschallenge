class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(list1 !=null || list2!=null){
            int data1=(list1!=null)?list1.val:Integer.MAX_VALUE;
            int data2=(list2!=null)?list2.val:Integer.MAX_VALUE;
            if(data1 <=data2){
                current.next=new ListNode(data1);
                current=current.next;
                list1=list1.next;
            }
            else{
                current.next=new ListNode(data2);
                current=current.next; 
                list2=list2.next;
            }
        }
        return dummy.next;
    }
}