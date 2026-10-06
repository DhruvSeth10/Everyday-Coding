# Transpose Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer array `matrix`, return  *the  **transpose**  of*  `matrix`.

The  **transpose**  of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 

 **Example 1:** 

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

```

 **Example 2:** 

```
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 1000
- 1 <= m * n <= 105
- -109 <= matrix[i][j] <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 23.76%)  
**Memory:** 46.7 MB (beats 47.19%)  
**Submitted:** 2026-10-06T10:14:22.402Z  

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;   
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/transpose-matrix/)