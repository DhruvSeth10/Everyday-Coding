# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 45.10%)  
**Memory:** 49.3 MB (beats 5.48%)  
**Submitted:** 2026-11-09T11:35:02.550Z  

```java
class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    public void reverse(char[] s, int l, int r) {
        if (l >= r)
            return;

        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        reverse(s, l+1, r-1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)