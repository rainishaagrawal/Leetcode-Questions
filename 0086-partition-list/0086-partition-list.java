/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode leftDummy = new ListNode(-1);
        ListNode rightDummy = new ListNode(-1);
        ListNode l = leftDummy;
        ListNode r = rightDummy;
        ListNode ptr = head;
        while (ptr != null) {
            if (ptr.val < x) {
                l.next = ptr;
                l = l.next;
            } else {
                r.next = ptr;
                r = r.next;
            }
            ptr = ptr.next;
        }
        r.next = null;
        l.next = rightDummy.next;
        return leftDummy.next;
    }
}