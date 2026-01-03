class Solution {

    int[] dp;

    public int coinChange(int[] coins, int amount) {

        dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = solve(coins, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int solve(int[] coins, int rem) {

        // base cases
        if(rem == 0) return 0;
        if(rem < 0) return Integer.MAX_VALUE;

        // memoized
        if(dp[rem] != -1) return dp[rem];

        int min = Integer.MAX_VALUE;

        for(int coin : coins) {
            int res = solve(coins, rem - coin);
            if(res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }

        dp[rem] = min;
        return min;
    }
}
