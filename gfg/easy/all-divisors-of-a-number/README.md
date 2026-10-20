# All Divisors of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n,**  return all the divisors of n in the ascending order.
 
 **Examples:** 

```
Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.

```

```
Input: n = 21191
Output: 1 21191
Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T10:48:37.344Z  

```java
class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divs = new ArrayList<>();

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                divs.add(i);
            }
        }

        int size = divs.size();

        for (int i = size - 1; i >= 0; i--) {
            int divisor = divs.get(i);
            int pair = n / divisor;

            if (divisor != pair) {
                divs.add(pair);
            }
        }

        return divs;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/all-divisors-of-a-number/1)