class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int i = 0, j = cols - 1;
        int count = 0;

        while (i < rows && j >= 0) {
            if (grid[i][j] < 0) {
                count += (rows - i); // all below are negative
                j--;                 // move left
            } else {
                i++;                 // move down
            }
        }
        return count;
    }
}
