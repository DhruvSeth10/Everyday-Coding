class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0; i<m; i++) {
            int minCol = 0;
            for (int j=1; j<n; j++) {
                if (matrix[i][minCol] > matrix[i][j])
                    minCol=j;
            }
            int min = matrix[i][minCol];
            boolean lucky = true;

            for (int k=0; k<m; k++) {
                if (matrix[k][minCol] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky)
                ans.add(min);
        }
        return ans;
    }
}