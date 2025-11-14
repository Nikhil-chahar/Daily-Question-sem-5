class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int grid[][] = new int[n][n];

        for(int q[] : queries){
            int rmin = q[0];
            int cmin = q[1];
            int rmax = q[2];
            int cmax = q[3];

            for(int i=rmin;i<=rmax;i++){
                for(int j=cmin;j<=cmax;j++){
                    grid[i][j]++;
                }
            }

        }
        return grid;
    }
}