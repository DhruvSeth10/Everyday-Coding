class Solution {
    public int heightChecker(int[] heights) {
        
        int[] count = new int[101];

        for(int i : heights){
            count[i]++;
        }

        int idx = 0, res = 0;

        for(int i = 1; i < 101; i++){
            while(count[i] != 0){

                if(heights[idx] != i) {
                    res++;
                }

                idx++;
                count[i]--;
            }
        }

        return res;
    }
}