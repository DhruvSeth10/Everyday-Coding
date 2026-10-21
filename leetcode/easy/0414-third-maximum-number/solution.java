class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            if (max < nums[i]) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (second < nums[i] && nums[i] != max) {
                third = second;
                second = nums[i];
            }
            else if (third < nums[i] && nums[i] != second && nums[i] != max)
                third = nums[i];
        }
        if (third != Long.MIN_VALUE)
            return (int) third;
        return (int) max;
    }
}