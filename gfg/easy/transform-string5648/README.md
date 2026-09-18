# Transform String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**. Find the minimum number of steps required to transform string s1 into string s2. The only allowed operation for the transformation is selecting a character from string s1 and inserting it in the beginning of string s1.

If transformation is not possible return  **-1**.

 **Examples:** 

```
Input: s1 = "abd", s2 = "bad"
Output: 1
Explanation: The conversion can take place in 1 operation: Pick 'b' and place it at the front.
```

```
Input: s1 = "GeeksForGeeks", s2 = "ForGeeksGeeks"
Output: 3
Explanation: The conversion can take place in 3 operations: 
Pick 'r' and place it at the front.
s1 = "rGeeksFoGeeks"
Pick 'o' and place it at the front.
s1 = "orGeeksFGeeks"
Pick 'F' and place it at the front.
s1 = "ForGeeksGeeks"
```

 **Constraints:** 
1<= s1.length(), s2.length() <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T04:53:10.873Z  

```java
class Solution {
    int transform(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int i=n-1;
        int j=n-1;
        int ans = 0;
        
        if (n != m)
            return -1;
        
        int[] freq = new int[128];
        for (int k = 0; k < n; k++) {
            freq[s1.charAt(k)]++;
            freq[s2.charAt(k)]--;
        }
        
        for(int count : freq){
            if (count != 0)
                return -1;
        }
            
            
        while(i >= 0) {
            if(s1.charAt(i) == s2.charAt(j)){
                i--;
                j--;
            }
            else{
                ans++;
                i--;
            }
        }
        
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/transform-string5648/1)