class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length,m = nums2.length;
        int dp[][]= new int[n+1][m+1];

        for(int a[] : dp){
            Arrays.fill(a,Integer.MIN_VALUE/2);
        }

        for(int i=n-1;i>=0;i--){
            for(int j = m-1;j>=0;j--){
                dp[i][j] = Math.max(Math.max(nums1[i] * nums2[j],(nums1[i] * nums2[j])+dp[i+1][j+1]),Math.max(dp[i+1][j],dp[i][j+1]));
            }
        }

        return dp[0][0];
    }
}