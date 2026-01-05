class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0,sm = Long.MAX_VALUE;
        long cnt=0;

        for(int ar[] : matrix){
            for(int num : ar){
                if(num < 0){
                    cnt++;
                }
                long val = Math.abs(num);
                sm = Math.min(sm,val);
                sum += val;
            }
        }
        if(cnt%2 == 0) return sum;

        return sum -2*sm;
    }
}