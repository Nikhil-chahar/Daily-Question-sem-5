class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) {
            res = Math.max(res, n);
        } 
        int maxc=1,minc =1;

        for(int num : nums){
            int temp = maxc *num;
            maxc = Math.max(temp,Math.max(minc*num,num));
            minc = Math.min(temp,Math.min(minc*num,num));
            res = Math.max(res,maxc);
        }
        return res;
    }
}