class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] =new int[matrix.length][matrix[0].length];
        for(int a[] : dp){
            Arrays.fill(a,-100);
        }
        int ans = Integer.MAX_VALUE;
        for(int col=0;col<matrix[0].length;col++){
            ans=Math.min(ans,Minimum_falling(matrix,0,col,dp));
        }
        return ans;
    }
    public static int Minimum_falling(int[][] grid, int cr,int cc,int dp[][]){
       if(cr == grid.length-1){
        return grid[cr][cc];
       }
       if(dp[cr][cc] != -100){
        return dp[cr][cc];
       }
       int ans = Integer.MAX_VALUE;
       for(int i=0;i<grid[0].length;i++){
        if(cc != i){
            ans = Math.min(ans,Minimum_falling(grid,cr+1,i,dp));
        }
       }
       return dp[cr][cc] = ans+grid[cr][cc];

    }
}