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
**Runtime:** 0 ms  
**Memory:** 41.8 MB  
**Submitted:** 2026-10-21T10:20:10.480Z  

```java
class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            if (max < nums[i]) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (second < nums[i] && nums[i] != max) {
                third = second;
                second = nums[i];
            }
            else if (third < nums[i] && nums[i] != second && nums[i] != max)
                third = nums[i];
        }
        if (third != Long.MIN_VALUE)
            return (int) third;
        return (int) max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)