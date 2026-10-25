class Solution {
    public int findDiff(int[] arr) {
        // code here
        HashMap<Integer, Integer> frq = new HashMap<>();
        for (int num : arr)
            frq.put(num, frq.getOrDefault(num, 0) + 1);
        
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for (int count : frq.values()) {
            max = Math.max(max, count);
            min = Math.min(min, count);
        }
        return max - min;
    }
}