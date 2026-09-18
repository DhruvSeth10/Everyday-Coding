class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int i = 1;
        int len = 0;
        int[] lps = new int[n];

        if (n==0)
            return "";

        while (i < n){
            if (s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                    len = lps[len-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        String ans = "";
        for (int j=0; j<lps[n-1]; j++){
            ans = ans + s.charAt(j);
        }
        return ans;
    }
}