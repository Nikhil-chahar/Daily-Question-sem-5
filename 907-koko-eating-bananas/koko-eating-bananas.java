class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1,hi=0,ans=0;

        for(int i=0;i<piles.length;i++){
            hi = Math.max(hi,piles[i]);
        }

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(pos(piles,mid,h)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public boolean pos(int piles[],int mid,int h){
        long sum =0;
        for(int i=0;i<piles.length;i++){
            sum += piles[i]/mid;
            if(piles[i]%mid !=0) sum++;
        }

        if(sum <= h) return true;

        return false;
    }
}