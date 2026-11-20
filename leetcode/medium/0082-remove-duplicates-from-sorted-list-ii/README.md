# Remove Duplicates from Sorted List II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a  **sorted**  linked list.

Delete all nodes that have  **duplicate**  numbers, leaving only  **distinct**  numbers from the original list.

Return the linked list  **sorted**  as well.

 

 **Example 1:** 

```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

```

 **Example 2:** 

```
Input: head = [1,1,1,2,3]
Output: [2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 41.51%)  
**Memory:** 44.5 MB (beats 75.22%)  
**Submitted:** 2026-11-20T17:53:24.452Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)