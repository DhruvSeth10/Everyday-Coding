# Split Linked List in Parts

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a singly linked list and an integer `k`, split the linked list into `k` consecutive linked list parts.

The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

Return  *an array of the* `k` *parts*.

 

 **Example 1:** 

```
Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but its string representation as a ListNode is [].

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
Output: [[1,2,3,4],[5,6,7],[8,9,10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 1000].
- 0 <= Node.val <= 1000
- 1 <= k <= 50

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.4 MB (beats 71.23%)  
**Submitted:** 2026-11-26T17:44:07.383Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/split-linked-list-in-parts/)