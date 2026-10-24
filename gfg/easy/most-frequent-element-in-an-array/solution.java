class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer, Integer> frq = new HashMap<>();
        for (int num : arr) {
            frq.put(num, frq.getOrDefault(num, 0) + 1);
        }
        
        int max = 0;
        int ans = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : frq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > max || count == max && num > ans) {
                max = count;
                ans = num;
            }
        }
        return ans;
    }
}