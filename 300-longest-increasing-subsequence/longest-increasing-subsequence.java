class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);

        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(nums[j] < nums[i]){
                    max = Math.max(dp[j],max);
                }
            }
            dp[i] += max;
        }
        int max =0;
        for(int i=0;i<n;i++){
            if(max < dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}