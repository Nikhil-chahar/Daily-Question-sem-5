class Solution {
    public int largestMagicSquare(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int max = Math.min(rows, cols);

        for (int k = max; k >= 2; k--) {
            for (int r = 0; r + k <= rows; r++) {
                for (int c = 0; c + k <= cols; c++) {
                    if (isMagic(r, c, k, grid)) {
                        return k;
                    }
                }
            }
        }
        return 1;
    }

    public boolean isMagic(int r, int c, int k, int[][] grid) {
        int target = 0;

        // first row sum
        for (int j = c; j < c + k; j++) {
            target += grid[r][j];
        }

        // rows
        for (int i = r; i < r + k; i++) {
            int sum = 0;
            for (int j = c; j < c + k; j++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }

        // columns
        for (int j = c; j < c + k; j++) {
            int sum = 0;
            for (int i = r; i < r + k; i++) {
                sum += grid[i][j];
            }
            if (sum != target) return false;
        }

        // main diagonal
        int d1 = 0;
        for (int i = 0; i < k; i++) {
            d1 += grid[r + i][c + i];
        }
        if (d1 != target) return false;

        // anti-diagonal
        int d2 = 0;
        for (int i = 0; i < k; i++) {
            d2 += grid[r + i][c + k - 1 - i];
        }
        if (d2 != target) return false;

        return true;
    }
}
