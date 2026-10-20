class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divs = new ArrayList<>();

        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                divs.add(i);
            }
        }

        int size = divs.size();

        for (int i = size - 1; i >= 0; i--) {
            int divisor = divs.get(i);
            int pair = n / divisor;

            if (divisor != pair) {
                divs.add(pair);
            }
        }

        return divs;
    }
}