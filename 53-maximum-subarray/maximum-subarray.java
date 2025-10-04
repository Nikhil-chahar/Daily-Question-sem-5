class Solution {
    public int maxSubArray(int[] nums) {
        int si=0,ei=0,currSum=0;
        int ans = Integer.MIN_VALUE;

        while(ei < nums.length){
            currSum += nums[ei];
            
            ans = Math.max(ans,currSum);

            while(currSum < 0){
                currSum -= nums[si];
                si++;
            }

            // ans = Math.max(ans,currSum);
            ei++;
        }
        return ans;
    }
}