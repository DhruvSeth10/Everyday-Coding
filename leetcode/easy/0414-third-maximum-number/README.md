# Third Maximum Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Return the  **third distinct maximum**  number in this array. If the third  **maximum**  does not exist, return the  **maximum**  number.

 

 **Example 1:** 

```
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

```

 **Example 2:** 

```
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

```

 **Example 3:** 

```
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Can you find an `O(n)` solution?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.75%)  
**Memory:** 44.7 MB (beats 77.04%)  
**Submitted:** 2026-10-03T19:28:07.351Z  

```java
class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            long val = num;

            if (val == max || val == secondMax || val == thirdMax) {
                continue;
            }

            if (val > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = val;
            } else if (val > secondMax) {
                thirdMax = secondMax;
                secondMax = val;
            } else if (val > thirdMax) {
                thirdMax = val;
            }
        }

        return thirdMax == Long.MIN_VALUE ? (int) max : (int) thirdMax;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)