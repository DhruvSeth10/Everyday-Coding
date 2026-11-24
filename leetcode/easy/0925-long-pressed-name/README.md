# Long Pressed Name

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Your friend is typing his `name` into a keyboard. Sometimes, when typing a character `c`, the key might get  *long pressed*, and the character will be typed 1 or more times.

You examine the `typed` characters of the keyboard. Return `True` if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 

Original
Java
 **Example 1:** 

```
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

```

 **Example 2:** 

```
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.

```

 

 **Constraints:** 

- 1 <= name.length, typed.length <= 1000
- name and typed consist of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 89.13%)  
**Memory:** 42.2 MB (beats 90.35%)  
**Submitted:** 2026-11-24T17:35:20.149Z  

```java
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/long-pressed-name/)