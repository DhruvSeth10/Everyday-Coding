class Solution {
    public String largestOddNumber(String num) {
        int l = 0;
        int r = num.length() - 1;

        while (r >= 0) {
            if ((num.charAt(r) - '0') %2 != 0)
                break;
            r--;
        }
        while (l <= r && num.charAt(l) == 0)
            l++;

        return r == -1 ? "" : num.substring(l, r+1);
    }
}