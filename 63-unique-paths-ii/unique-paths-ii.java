class Solution {
    public int count=0;
    public int uniquePathsWithObstacles(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];

        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        return permu(grid,0,0,dp);
    }
    public int permu(int grid[][], int row,int col,int dp[][]){
        int n = grid.length, m = grid[0].length;

        if(row >= n || col >= m || grid[row][col] == 1){
            return 0;
        }
        if(row == n-1 && col == m-1){
            return 1;
        }
       
        if(dp[row][col] != -1){
            return dp[row][col];
        }
        int down = permu(grid,row+1,col,dp);
        int right = permu(grid,row,col+1,dp);
        // int down = permu(grid,row+1,col,dp);

        return dp[row][col] = down + right;
    }
}