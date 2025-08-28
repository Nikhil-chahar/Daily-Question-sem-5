class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> d = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d.computeIfAbsent(j - i, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        for (int key : d.keySet()) {
            List<Integer> diag = d.get(key);
            if (key <= 0) diag.sort(Collections.reverseOrder());
            else Collections.sort(diag);
        }

        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                int key = j - i;
                List<Integer> diag = d.get(key);
                grid[i][j] = diag.remove(diag.size() - 1);
            }
        }
        return grid;
    }
}