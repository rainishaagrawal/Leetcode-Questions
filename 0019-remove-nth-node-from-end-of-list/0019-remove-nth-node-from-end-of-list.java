class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
            count++;
        }
        if (n == count) {
            return head.next;
        }
        int ncount = count - n - 1;
        ListNode curr = head;
        while (ncount != 0) {
            curr = curr.next;
            ncount--;
        }
        curr.next = curr.next.next;
        return head;
    }
}