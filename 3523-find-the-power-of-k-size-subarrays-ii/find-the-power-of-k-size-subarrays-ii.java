class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int bad = 0;
        int ans[] = new int[n-k+1];

        for(int i=0;i<k-1;i++){
            if(nums[i]+1 != nums[i+1]) bad++;
        }

        for(int i=0;i<=n-k;i++){
            if(bad == 0){
                ans[i] = nums[i+k-1];
            }else{
                ans[i] = -1;
            }

            // remove left 
            if(i+1 < n && nums[i]+1 != nums[i+1]){
                bad--;
            } 
            // add right
            if(i+k < n && nums[i+k-1]+1 != nums[i+k]){
                bad++;
            }
        }
        return ans;
    }
}