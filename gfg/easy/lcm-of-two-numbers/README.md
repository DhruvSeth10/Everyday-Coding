# LCM of Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two positive integers  **a**  and  **b**, find the Least Common Multiple (LCM) of the two numbers.

 **Examples:** 

```
Input: a = 12, b = 18
Output: 36
Explanation: LCM of 12 and 18 is 36
```

```
Input: a = 5, b = 11
Output: 55
Explanation: LCM of 5 and 11 is 55
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T10:04:09.937Z  

```java
class Solution {
    public int lcm(int a, int b) {
        // code here
        int num = a * b;
        
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = a;
        int lcm = num/gcd;
        return lcm;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lcm-of-two-numbers/1)