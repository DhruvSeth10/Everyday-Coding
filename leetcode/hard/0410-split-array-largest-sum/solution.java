class Solution {
    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;

        for (int num : nums) {
            if (num > low) {
                low = num;
            }
            high += num;
        }

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (canSplitIntoAtMostK(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    private boolean canSplitIntoAtMostK(int[] nums, int k, long maxAllowedSum) {
        int subarraysUsed = 1;
        long currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxAllowedSum) {
                subarraysUsed++;
                currentSum = num;
                if (subarraysUsed > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}