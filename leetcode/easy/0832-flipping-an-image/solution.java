class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        for (int i=0; i<rows; i++) {
            int left = 0;
            int right = cols - 1;
            while (left <= right) {
                int temp = image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = 1 - temp;
                left++;
                right--;
            }
        }
        return image;
    }
}