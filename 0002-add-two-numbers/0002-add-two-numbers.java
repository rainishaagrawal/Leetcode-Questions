/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carr = 0;
        while (l1 != null || l2 != null) {
            int currsum = carr;
            if (l1 != null) {
                currsum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currsum += l2.val;
                l2 = l2.next;
            }
            carr = currsum / 10;
            ListNode newNode = new ListNode(currsum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        if (carr > 0) {
            temp.next = new ListNode(carr);
        }
        return dummy.next;
    }
}