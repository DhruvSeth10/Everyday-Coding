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