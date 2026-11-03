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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode temp = head;

        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        temp.next = head;
        k = k % length;
        int x = length - k;
        ListNode temp2 = head;
        int i = 1;

        while (i < x) {
            temp2 = temp2.next;
            i++;
        }

        ListNode newhead = temp2.next;
        temp2.next = null;

        return newhead;
    }
}