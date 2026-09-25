# Minimum Swaps to Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  of distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

 **Examples:** 

```
Input: arr[] = [2, 8, 5, 4]
Output: 1
Explanation: Swap 8 with 4 to get the sorted array.
```

```
Input: arr[] = [10, 19, 6, 3, 5]
Output: 2
Explanation: Swap 10 with 3 and 19 with 5 to get the sorted array.

```

```
Input: arr[] = [1, 3, 4, 5, 6]
Output: 0
Explanation: Input array is already sorted.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T04:17:10.509Z  

```java
class Solution {
    public int minSwaps(int[] arr) {

        int n = arr.length;

        // Create sorted copy
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // visited[i] tells whether index i is already processed
        boolean[] visited = new boolean[n];

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            // Already visited or already in correct position
            if (visited[i] || arr[i] == sorted[i]) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            // Find cycle
            while (!visited[j]) {

                visited[j] = true;

                // Find where arr[j] should go
                int next = Arrays.binarySearch(sorted, arr[j]);

                j = next;
                cycleLength++;
            }

            // Cycle of length L needs L - 1 swaps
            swaps += cycleLength - 1;
        }

        return swaps;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-swaps/1)