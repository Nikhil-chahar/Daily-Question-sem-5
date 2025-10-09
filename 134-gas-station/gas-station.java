class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0;
        for(int i=0;i<gas.length;i++){
            t += gas[i]-cost[i];
        }
        if(t <0){
            return -1;
        }
        int ind=0;
        int curr=0;

        for(int i=0;i<gas.length;i++){
            curr +=gas[i]-cost[i];
            if(curr < 0){
                curr =0;
                ind= i+1;
            }
        }
        return ind;
    }
}