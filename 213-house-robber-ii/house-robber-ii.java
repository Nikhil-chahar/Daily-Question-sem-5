class Solution {
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        int fir = robb(nums,dp,0,nums.length-1);
        Arrays.fill(dp,-1);
        int sec = robb(nums,dp,1,nums.length);

        return Math.max(fir,sec);
    }
    public int robb(int nums[],int dp[],int i,int len){
        if(i >= len){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int inc = nums[i]+robb(nums,dp,i+2,len);
        int exc = robb(nums,dp,i+1,len);

        return dp[i] = Math.max(inc,exc);
    }
}