# Sort Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a stack of integers  **st[]**. Sort the stack in ascending order (smallest element at the bottom and largest at the top).

 **Examples:** 

```
Input: st[] = [41, 3, 32, 2, 11]
Output: [41, 32, 11, 3, 2]
Explanation: After sorting, the smallest element (2) is at the bottom and the largest element (41) is at the top.

```

```
Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: The stack is already sorted in ascending order.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T04:12:01.596Z  

```java
class Solution {
    public Stack<Integer> sortStack(Stack<Integer> s) {
        if(!s.isEmpty()) {
            int top = s.pop();
            sortStack(s);
            sortedInsert(s, top);
        }
        return s;
    }
    
    private void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek()<=x) {
            s.push(x);
            return;
        }
        int top = s.pop();
        sortedInsert(s, x);
        s.push(top);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-a-stack/1)