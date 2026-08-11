class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        if (count < k) {
            return head;
        }
        ListNode t1 = head;
        for (int i = 0; i < k - 1; i++) {
            t1 = t1.next;
        }
        ListNode t2 = t1.next;
        t1.next = null;
        ListNode result = reverse(head);
        head.next = reverseKGroup(t2, k);
        return result;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}