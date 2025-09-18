class Solution {
    public int minFallingPathSum(int[][] grid) {
        int dp[][]  = new int[grid.length][grid[0].length];
        for(int a[]: dp){
            Arrays.fill(a,-101);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            ans = Math.min(ans,min(grid,0,i,dp));
        }
        return ans;
    }
    public int min(int grid[][],int r,int c,int dp[][]){
        if(c <0 || c >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(r == grid.length-1){
            return grid[r][c];
        }
        if(dp[r][c] != -101){
            return dp[r][c];
        }

        int dl = min(grid,r+1,c-1,dp);
        int dr = min(grid,r+1,c+1,dp);
        int d = min(grid,r+1,c,dp);

        return dp[r][c] =  Math.min(d,Math.min(dl,dr)) + grid[r][c];
    }
}