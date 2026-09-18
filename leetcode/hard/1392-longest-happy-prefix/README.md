# Longest Happy Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A string is called a  **happy prefix**  if it is a  **non-empty**  prefix which is also a suffix (excluding itself).

Given a string `s`, return  *the  **longest happy prefix**  of*  `s`. Return an empty string `""` if no such prefix exists.

 

 **Example 1:** 

```
Input: s = "level"
Output: "l"
Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

```

 **Example 2:** 

```
Input: s = "ababab"
Output: "abab"
Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s contains only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 737 ms (beats 5.19%)  
**Memory:** 53.5 MB (beats 5.65%)  
**Submitted:** 2026-09-18T04:57:35.772Z  

```java
class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int i = 1;
        int len = 0;
        int[] lps = new int[n];

        if (n==0)
            return "";

        while (i < n){
            if (s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                    len = lps[len-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        String ans = "";
        for (int j=0; j<lps[n-1]; j++){
            ans = ans + s.charAt(j);
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-happy-prefix/)