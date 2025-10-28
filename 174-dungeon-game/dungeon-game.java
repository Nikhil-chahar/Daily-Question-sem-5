class Solution {
    public int calculateMinimumHP(int[][] dung) {
        int dp[][] = new int[dung.length][dung[0].length];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }

        return helper(dung,0,0,dp);
    }
    public int helper(int dung[][] ,int row,int col,int dp[][]){
        if(row == dung.length || col == dung[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }

        if(row == dung.length-1 && col == dung[0].length-1){
            return dp[row][col] = Math.max(1,1-dung[row][col]);
        }

        int right = helper(dung,row,col+1,dp);
        int down =  helper(dung,row+1,col,dp);

        int tl= Math.min(right,down)-dung[row][col];
        return dp[row][col] = Math.max(1,tl);
    }
}