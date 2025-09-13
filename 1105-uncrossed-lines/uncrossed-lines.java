class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        // return LCSBU(nums1,nums2);
        int dp[][] = new int[nums1.length][nums2.length];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        return lcs(nums1,nums2,0,0,dp);
    }
    public int lcs(int[] s1,int[] s2,int i,int j,int dp[][]){
        if(i == s1.length || j == s2.length){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans =0;
        if(s1[i] == s2[j]){
            ans = 1 + lcs(s1,s2,i+1,j+1,dp);
        }else{
            int f = lcs(s1,s2,i+1,j,dp);
            int s = lcs(s1,s2,i,j+1,dp);
            ans = Math.max(f,s);
        }
        return dp[i][j] = ans;
    }







    // public int LCSBU(int[] s1,int[] s2){
    //     int dp[][] = new int[s1.length+1][s2.length+1];
    //     for(int i=1;i<dp.length;i++){
    //         for(int j=1;j<dp[0].length;j++){
    //             int ans = 0;
    //             if(s1[i-1] == s2[j-1]){
    //                 ans = 1+dp[i-1][j-1];
    //             }else{
    //                 int f = dp[i-1][j];
    //                 int s = dp[i][j-1];
    //                 ans = Math.max(f,s);
    //             }
    //             dp[i][j] = ans;
    //         }
    //     }
    //     return dp[dp.length-1][dp[0].length-1];
    // }
}