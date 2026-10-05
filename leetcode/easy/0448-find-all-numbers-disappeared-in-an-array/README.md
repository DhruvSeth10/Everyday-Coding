# Find All Numbers Disappeared in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return  *an array of all the integers in the range*  `[1, n]`  *that do not appear in*  `nums`.

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

```

 **Example 2:** 

```
Input: nums = [1,1]
Output: [2]

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n

 

 **Follow up:**  Could you do it without extra space and in `O(n)` runtime? You may assume the returned list does not count as extra space.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 84.37%)  
**Memory:** 67.3 MB (beats 54.61%)  
**Submitted:** 2026-10-05T17:56:35.398Z  

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)