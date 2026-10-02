# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 74.29%)  
**Memory:** 63.4 MB (beats 7.06%)  
**Submitted:** 2026-10-02T18:14:44.897Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = 0;
        int count = 0;

        for (int i=0; i<n; i++) {
            if (count == 0)
                candidate = nums[i];
            if (nums[i] == candidate)
                count++;
            else 
                count--;
        }
        return candidate;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)