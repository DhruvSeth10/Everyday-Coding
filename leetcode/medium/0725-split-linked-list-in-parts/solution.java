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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // 1. Find the total length of the linked list
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        // 2. Determine base size and remainder
        int baseSize = n / k;
        int extra = n % k;

        ListNode[] result = new ListNode[k];
        curr = head;

        // 3. Carve out each of the k parts
        for (int i = 0; i < k; i++) {
            int currentPartSize = baseSize + (i < extra ? 1 : 0);

            if (curr == null) {
                result[i] = null;
                continue;
            }

            result[i] = curr;
            // Move to the last node of the current part
            for (int step = 1; step < currentPartSize; step++) {
                curr = curr.next;
            }

            // Detach the current part from the rest of the list
            ListNode nextPartHead = curr.next;
            curr.next = null;
            curr = nextPartHead;
        }

        return result;
    }
}