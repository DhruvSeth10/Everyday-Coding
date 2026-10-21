# Lucky Numbers in a Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an `m x n` matrix of  **distinct** numbers, return  *all  **lucky numbers**  in the matrix in  **any** order*.

A  **lucky number**  is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

 **Example 1:** 

```
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 2:** 

```
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 **Example 3:** 

```
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= n, m <= 50
- 1 <= matrix[i][j] <= 105.
- All elements in the matrix are distinct.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 95.92%)  
**Memory:** 46.1 MB (beats 99.77%)  
**Submitted:** 2026-10-21T10:23:57.041Z  

```java
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0; i<m; i++) {
            int minCol = 0;
            for (int j=1; j<n; j++) {
                if (matrix[i][minCol] > matrix[i][j])
                    minCol=j;
            }
            int min = matrix[i][minCol];
            boolean lucky = true;

            for (int k=0; k<m; k++) {
                if (matrix[k][minCol] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky)
                ans.add(min);
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)