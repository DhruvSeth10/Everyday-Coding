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
        ListNode lessDummy = new ListNode(0);
        ListNode geDummy = new ListNode(0);
        ListNode lessTail = lessDummy;
        ListNode geTail = geDummy;

        while (head != null) {
            if (head.val < x) {
                lessTail.next = head;
                lessTail = lessTail.next;
            } else {
                geTail.next = head;
                geTail = geTail.next;
            }
            head = head.next;
        }

        // Prevent a cycle if the last node originally had val < x
        geTail.next = null;
        lessTail.next = geDummy.next;

        return lessDummy.next;
    }
}