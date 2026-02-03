class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int start = 0;
        int end = nums.length - 1;
        int[] ans = new int[2];
        

        while(start <= end){
            if(nums[start] == target && nums[end] == target){
                ans[0] = start;
                ans[1] = end;
                return ans;
            }
            else if(nums[start] != target){
                start++;
            }else if(nums[end] != target){
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}