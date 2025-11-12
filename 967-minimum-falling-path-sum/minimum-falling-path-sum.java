class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int a[] : dp){
            Arrays.fill(a,-101);
        }
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            mn = Math.min(mn,minimumSum(matrix,0,i,dp));
        }
        return mn;
    }
    public static int minimumSum(int[][] grid,int cr,int cc,int[][] dp){
        if(cc>=grid[0].length || cc<0){
            return Integer.MAX_VALUE;
        }
        if(cr==grid.length-1){
            return grid[cr][cc];   
        }
        if(dp[cr][cc] != -101){
            return dp[cr][cc];
        }
        int l=minimumSum(grid,cr+1,cc-1,dp);
        int d=minimumSum(grid,cr+1,cc,dp);
        int r=minimumSum(grid,cr+1,cc+1,dp);
        
        return dp[cr][cc]=Math.min(d,Math.min(l,r))+grid[cr][cc];
    }
    
}