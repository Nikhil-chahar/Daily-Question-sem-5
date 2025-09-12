class Solution {
    public int rob(int[] nums) {
       int dp[] = new int[nums.length];
       Arrays.fill(dp,-1);
       return robb(nums,0,dp);

    //    return 2;
    }
    public int robb(int nums[],int i,int dp[]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }

        int rob = nums[i] + robb(nums,i+2,dp);
        int n_rob = robb(nums,i+1,dp);

        return dp[i] = Math.max(rob,n_rob);

    }
}