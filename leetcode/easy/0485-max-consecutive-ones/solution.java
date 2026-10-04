class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1)
                current++;
            else {
                max=Math.max(max,current);
                current = 0;
            }
        }
        return max=Math.max(max,current);
    }
}