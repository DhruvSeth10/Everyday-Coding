# Kth Smallest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, find and return the  **kth smallest**  element in the given array.
 **Note:**  The kth smallest element is determined based on the sorted order of the array.

 **Examples :** 

```
Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
```

```
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T04:59:54.672Z  

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        // int size = arr.length, i, j, t;
        
        // for(i=0; i<size; i++){
        //     for(j=0; j< size-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             t = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = t;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        return arr[k-1];
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1)