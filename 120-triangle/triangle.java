class Solution {
    int m;
    Integer dp[][];
    public int minimumTotal(List<List<Integer>> triangle) {
        m=triangle.size();
        dp = new Integer[m][m];

        return helper(triangle,0,0);
    }
    public int helper(List<List<Integer>> tri,int row,int col){
        if(row == tri.size()){
            return 0;
        }
        if(dp[row][col] != null){
            return dp[row][col];
        }
        int down = helper(tri,row+1,col);
        int downR = helper(tri,row+1,col+1);
        return dp[row][col] = tri.get(row).get(col) + Math.min(down,downR);
    }
}