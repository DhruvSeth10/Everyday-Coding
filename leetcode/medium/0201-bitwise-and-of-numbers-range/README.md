# Bitwise AND of Numbers Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers `left` and `right` that represent the range `[left, right]`, return  *the bitwise AND of all numbers in this range, inclusive*.

 

Original
Java
 **Example 1:** 

```
Input: left = 5, right = 7
Output: 4

```

 **Example 2:** 

```
Input: left = 0, right = 0
Output: 0

```

 **Example 3:** 

```
Input: left = 1, right = 2147483647
Output: 0

```

 

 **Constraints:** 

- 0 <= left <= right <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 53.31%)  
**Memory:** 45.6 MB (beats 52.30%)  
**Submitted:** 2026-11-25T17:41:17.856Z  

```java
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right = right & (right - 1);
        }
        return right;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/bitwise-and-of-numbers-range/)