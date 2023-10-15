public class addtwonumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode tail1=l1;
        ListNode tail2=l2;
        int sum=0;
        int carry=0;
        int n=0;
        ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
        while(tail1!=null || tail2!=null){
            int data1=(tail1 != null) ? tail1.val : 0;
            int data2=(tail2 != null) ? tail2.val : 0;
             n=data1+data2+carry;
                sum=n%10;
        
            carry=n/10;
            current.next = new ListNode(sum);
            current = current.next;
            if (tail1 != null){
                 tail1 = tail1.next;
            }
            if (tail2 != null){ 
                tail2 = tail2.next;
            }
        
    }
           if (carry > 0) {
            current.next = new ListNode(carry);  

        }

        

        return dummyHead.next;
        
    }
}
