class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preSlow = null;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null) {
            if (slow.val != fast.val) {
                // slow is distinct so far; advance preSlow, slow, and fast
                preSlow = slow;
                slow = fast;
                fast = fast.next;
            } else {
                // Move fast past all nodes matching slow.val
                while (fast != null && fast.val == slow.val) {
                    fast = fast.next;
                }

                // Remove all nodes from slow up to (but not including) fast
                if (preSlow == null) {
                    head = fast;
                } else {
                    preSlow.next = fast;
                }

                // Prepare slow and fast for the next candidate value
                slow = fast;
                fast = (fast != null) ? fast.next : null;
            }
        }

        return head;
    }
}