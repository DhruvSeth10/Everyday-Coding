class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int i=1;
        int len=0;
        int[] lps = new int[m];

        if(m==0 || m>n)
            return -1;

        while(i<m){
            if (needle.charAt(i) == needle.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0)
                    len = lps[len-1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        i=0; int j=0;
        while(i < n){
            if (needle.charAt(j) == haystack.charAt(i)){
                i++; j++;
            }
            if (j == m)
                return i-j;

            else if (i<n && needle.charAt(j) != haystack.charAt(i)) {
                if(j != 0)
                    j = lps[j-1];
                else
                    i++;
            }
        }
        return -1;
    }
}