# Count Primes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer `n`, return  *the number of prime numbers that are strictly less than*  `n`.

 

 **Example 1:** 

```
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

```

 **Example 2:** 

```
Input: n = 0
Output: 0

```

 **Example 3:** 

```
Input: n = 1
Output: 0

```

 

 **Constraints:** 

- 0 <= n <= 5 * 106

## Solution

**Language:** Java  
**Runtime:** 97 ms (beats 98.34%)  
**Memory:** 50.4 MB (beats 97.94%)  
**Submitted:** 2026-10-19T08:33:17.023Z  

```java
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        java.util.Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i=2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<n; j+=i)
                    isPrime[j] = false;
            }
        }

        int total = 0;
        for (int i=2; i<n; i++) {
            if (isPrime[i])
                total++;
        }
        return total;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)