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
**Runtime:** 117 ms (beats 93.45%)  
**Memory:** 50.7 MB (beats 96.13%)  
**Submitted:** 2026-10-19T09:24:20.218Z  

```java
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i=2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j=i*i; j<n; j += i)
                    isPrime[j] = false;
            }
        }

        int total = 0;
        for (int i=0; i<n; i++) {
            if (isPrime[i])
                total++;
        }
        return total;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-primes/)