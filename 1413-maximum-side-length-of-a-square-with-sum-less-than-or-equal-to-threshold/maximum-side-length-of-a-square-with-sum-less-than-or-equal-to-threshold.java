class Solution {
    public int maxSideLength(int[][] grid, int threshold) {
        int rows = grid.length, cols = grid[0].length;

        int[][] ps = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                ps[i][j] = grid[i - 1][j - 1] + ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1];
            }
        }

        int low = 0, high = Math.min(rows, cols), ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (existsSquare(ps, mid, threshold)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean existsSquare(int[][] ps, int len, int threshold) {
        for (int i = len; i < ps.length; i++) {
            for (int j = len; j < ps[0].length; j++) {
                int sum = ps[i][j]- ps[i - len][j]- ps[i][j - len] + ps[i - len][j - len];
                if (sum <= threshold) return true;
            }
        }
        return false;
    }
}
