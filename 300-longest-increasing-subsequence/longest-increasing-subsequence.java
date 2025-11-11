class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=0;i<nums.length;i++){
            int max =0;
            for(int j=i;j>=0;j--){
                if(nums[i] > nums[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
        }

        int val=0;
        for(int i=0;i<dp.length;i++){
            if(val < dp[i]){
                val = dp[i];
            }
        }
        return val;
    }
}