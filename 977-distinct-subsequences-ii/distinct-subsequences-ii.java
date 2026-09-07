class Solution {
    int mod= 1000000007;
    public int distinctSubseqII(String s) {
        int total = 0;
        int dp[] = new int[26];

        for(char ch : s.toCharArray()){
            int ind = ch-'a';
            int ns = (total +1-dp[ind]+mod)%mod;
            dp[ind] = (dp[ind] + ns)%mod;
            total = (total+ns)%mod;
        }
        return total;
    }
}