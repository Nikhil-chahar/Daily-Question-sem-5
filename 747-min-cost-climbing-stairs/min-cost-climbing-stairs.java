class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int dp[] = new int[cost.length];
       Arrays.fill(dp,-1);
       int zero = minCost(cost,0,dp); 
       int one = minCost(cost,1,dp);
       return Math.min(zero,one);
    }
    public int minCost(int cost[],int i,int dp[]){
        if(i >= cost.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int cnt = minCost(cost,i+1,dp);
        int n_cnt = minCost(cost,i+2,dp);

        return dp[i] = Math.min(cnt,n_cnt)+cost[i];

    }
}