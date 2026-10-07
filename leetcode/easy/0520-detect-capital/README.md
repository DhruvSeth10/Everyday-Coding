# Detect Capital

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital, like "Google".

Given a string `word`, return `true` if the usage of capitals in it is right.

 

 **Example 1:** 

```
Input: word = "USA"
Output: true

```

 **Example 2:** 

```
Input: word = "FlaG"
Output: false

```

 

 **Constraints:** 

- 1 <= word.length <= 100
- word consists of lowercase and uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.3 MB (beats 25.39%)  
**Submitted:** 2026-10-07T04:58:12.102Z  

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                upper++;
        }
        if (upper == 0)
            return true;
        if (upper == word.length())
            return true;
        if (upper == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
            return true;
        
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/detect-capital/)