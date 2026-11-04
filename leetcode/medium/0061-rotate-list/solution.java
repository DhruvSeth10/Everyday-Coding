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

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        temp.next = head;
        k = k%length;
        int x = length - k;
        int i = 1;
        ListNode temp2 = head;

        while (i < x) {
            temp2 = temp2.next;
            i++;
        }

        ListNode newhead = temp2.next;
        temp2.next = null;

        return newhead;
    }
}