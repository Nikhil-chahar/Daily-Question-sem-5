class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int[amount+1][coins.length];
        for(int a[]: dp){
            Arrays.fill(a,-1);
        }

        return calc(amount,coins,0,dp);
    }
    public int calc(int amount,int[] coins,int i,int dp[][]){
        if(amount == 0){
            return 1;
        }
        if(i== coins.length){
            return 0;
        }
        if(dp[amount][i] != -1){
            return dp[amount][i];
        }
        int inc =0, exc =0;

        if(amount >= coins[i]){
            inc = calc(amount-coins[i],coins,i,dp);
        }
        exc = calc(amount,coins,i+1,dp);

        return dp[amount][i] = inc + exc;
    }
}