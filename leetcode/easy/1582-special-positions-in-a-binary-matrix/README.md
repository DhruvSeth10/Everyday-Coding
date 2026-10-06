# Special Positions in a Binary Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an `m x n` binary matrix `mat`, return  *the number of special positions in* `mat` *.* 

A position `(i, j)` is called  **special**  if `mat[i][j] == 1` and all other elements in row `i` and column `j` are `0` (rows and columns are  **0-indexed**).

 

 **Example 1:** 

```
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

```

 **Example 2:** 

```
Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= m, n <= 100
- mat[i][j] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 98.03%)  
**Memory:** 47.1 MB (beats 50.12%)  
**Submitted:** 2026-10-06T14:36:39.740Z  

```java
class Solution {
    public int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int count = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1)
                    count++;
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/special-positions-in-a-binary-matrix/)