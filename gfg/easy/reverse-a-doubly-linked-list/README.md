# Reverse a Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a doubly linked list, reverse the list and return the head of the reversed doubly linked list.

 **Note:** Driver code will print the returned list in both forward and backward directions.

 **Examples:** 

```
Input:

Output: 
5 <-> 4 <-> 3
3 <-> 4 <-> 5
Explanation: After reversing the given doubly linked list the new list will be 5 <-> 4 <-> 3.

```

```
Input: 

Output: 
196 <-> 59 <-> 122 <-> 75
75 <-> 122 <-> 59 <-> 196
Explanation: After reversing the given doubly linked list the new list will be 196 <-> 59 <-> 122 <-> 75.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T05:03:31.506Z  

```java
/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            head = curr;
            curr = temp;
        }

        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1)