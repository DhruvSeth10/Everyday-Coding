# Sort Array By Parity

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all the even integers at the beginning of the array followed by all the odd integers.

Return  ***any array**  that satisfies this condition*.

 

 **Example 1:** 

```
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.1 MB (beats 14.60%)  
**Submitted:** 2026-10-05T13:04:05.816Z  

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        
        while (left < right) {
            if (nums[left] % 2 == 0)
                left++;
            else if (nums[right] % 2 != 0)
                right--;
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-array-by-parity/)