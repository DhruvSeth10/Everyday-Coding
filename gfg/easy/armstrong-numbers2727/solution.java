class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int count = 0, total = 0;
        int original = n, x = n;

        while (x != 0) {
            count++;
            x /= 10;
        }

        while (n != 0) {
            int digit = n % 10;
            total += Math.pow(digit, count);
            n /= 10;
        }

        return total == original;
    }
}