class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp1 = head;        
        ListNode temp2 = head.next;   
        ListNode evenHead = temp2;    
        while (temp2 != null && temp2.next != null) {
            ListNode curr = temp2.next;  
            temp1.next = curr;
            temp1 = temp1.next;

            temp2.next = curr.next;       
            temp2 = temp2.next;
        }
        temp1.next = evenHead;
        return head;
    }
}