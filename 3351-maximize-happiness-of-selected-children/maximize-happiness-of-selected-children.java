class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        int ind = hap.length-1,turn=0;
        long ans=0;

        while(k>0){
            int val = hap[ind--]-turn;
            if(val >0){
                ans += val;
            }
            turn++;
            k--;
        }
        return ans;

    }
}