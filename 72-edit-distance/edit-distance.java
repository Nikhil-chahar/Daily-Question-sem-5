class Solution {
    public int minDistance(String s, String t) {
        int dp[][] = new int[s.length()+1][t.length()+1];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        return minDis(s,t,0,0,dp);
    }
    public int minDis(String s,String t,int i,int j,int dp[][]){
        if(i == s.length()){
            return t.length()-j;
        }
        if(j == t.length()){
            return s.length()-i;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i) == t.charAt(j)){
            ans = minDis(s,t,i+1,j+1,dp);
        }
        else{
            int D = minDis(s,t,i+1,j,dp);
            int I = minDis(s,t,i,j+1,dp);
            int R = minDis(s,t,i+1,j+1,dp);
            ans = 1+Math.min(I,Math.min(D,R));
        }
        return dp[i][j] = ans;

    }
}