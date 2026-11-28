# Repeated String Match

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `a` and `b`​​​​​​​ consisting of lowercase English letters​​​​​​​.

Return the  **minimum**  number of times you should repeat string `a` so that string `b` is a  **substring**  of it. If it is  **impossible**  for `b`​​​​​​ to be a substring of `a` after repeating it, return -1.

 **Note:**  string `"abc"` repeated 0 times is `""`, repeated 1 time is `"abc"` and repeated 2 times is `"abcabc"`.

A  **subarray**  is a contiguous sequence of elements within an array.

 

Original
Java
 **Example 1:** 

```
Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

```

 **Example 2:** 

```
Input: a = "a", b = "aa"
Output: 2

```

 

 **Constraints:** 

- 1 <= a.length, b.length <= 104
- a and b consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 260 ms (beats 79.99%)  
**Memory:** 43 MB (beats 82.74%)  
**Submitted:** 2026-11-28T17:23:26.860Z  

```java
class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < minRepeats; i++) {
            sb.append(a);
        }

        // Check after reaching at least b.length()
        if (sb.indexOf(b) != -1) {
            return minRepeats;
        }

        // Check one additional repetition to handle boundary overlaps
        sb.append(a);
        if (sb.indexOf(b) != -1) {
            return minRepeats + 1;
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-string-match/)