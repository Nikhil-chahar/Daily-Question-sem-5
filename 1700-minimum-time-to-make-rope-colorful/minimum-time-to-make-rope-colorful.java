class Solution {
    public int minCost(String colors, int[] neededTime) {
        int cnt=0;
        int prev =0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i) == colors.charAt(prev)){
                cnt += Math.min(neededTime[i],neededTime[prev]);
                if(neededTime[i] > neededTime[prev]){
                    prev = i;
                }
            }else{
                prev = i;
            }
        }
        return cnt;
    }
}