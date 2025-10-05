class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0,right=0,t = k,ans=0;
        int zero=0;

        while(right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);

            right++;
        }
        return ans;
    }
}