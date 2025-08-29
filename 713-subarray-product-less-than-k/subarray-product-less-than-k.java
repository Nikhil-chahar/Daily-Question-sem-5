class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si=0;
        int ei=0;
        int ans =0;
        int p=1;

        while(ei < nums.length){
            // growing
            p = p*nums[ei];
            // shrink
            while(p >= k && si <=ei){
                p = p/nums[si];
                si++;
            }
            ans = ans+(ei-si+1);
            ei++;
        }
        return ans;
    }
}