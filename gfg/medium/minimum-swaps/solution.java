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