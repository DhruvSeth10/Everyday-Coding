class Solution {
    public int lcm(int a, int b) {
        // code here
        int num = a * b;
        
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int gcd = a;
        int lcm = num/gcd;
        return lcm;
    }
}