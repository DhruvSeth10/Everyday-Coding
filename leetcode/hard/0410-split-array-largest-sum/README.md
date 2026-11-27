# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is  **minimized**.

Return  *the minimized largest sum of the split*.

A  **subarray**  is a contiguous part of the array.

 

Original
Java
 **Example 1:** 

```
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 106
- 1 <= k <= min(50, nums.length)

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.5 MB (beats 67.70%)  
**Submitted:** 2026-11-27T17:56:25.407Z  

```java
class Solution {
    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;

        for (int num : nums) {
            if (num > low) {
                low = num;
            }
            high += num;
        }

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (canSplitIntoAtMostK(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    private boolean canSplitIntoAtMostK(int[] nums, int k, long maxAllowedSum) {
        int subarraysUsed = 1;
        long currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                subarraysUsed++;
                currentSum = num;
                if (subarraysUsed > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/split-array-largest-sum/)