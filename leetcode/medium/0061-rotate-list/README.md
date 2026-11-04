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
**Runtime:** 1 ms (beats 9.84%)  
**Memory:** 43.7 MB (beats 93.38%)  
**Submitted:** 2026-11-04T20:46:18.899Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)