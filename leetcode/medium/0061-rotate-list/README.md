# Rotate List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, rotate the list to the right by `k` places.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

```

 **Example 2:** 

```
Input: head = [0,1,2], k = 4
Output: [2,0,1]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 500].
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.9 MB (beats 78.32%)  
**Submitted:** 2026-11-03T17:24:16.101Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)