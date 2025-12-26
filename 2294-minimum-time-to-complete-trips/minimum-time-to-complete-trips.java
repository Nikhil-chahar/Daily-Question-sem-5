class Solution {
    public long minimumTime(int[] time, int total) {
        long lo = Long.MAX_VALUE,hi=0,ans=0;
        for(int i=0;i<time.length;i++){
            if(lo > time[i]) lo = time[i];
        }
        hi = (long)lo*total;
        lo=1;
        while(lo <= hi){
            long mid = lo + (hi-lo)/2;
            if(pos(mid,time,total)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public boolean pos(long tm,int time[],int total){
        long val = 0;
        for(int i=0;i<time.length;i++){
            val= val + (tm/time[i]);
        }
        if(val >= total){
            return true;
        }
        return false;
    }
}