class Solution {
    public void moveZeroes(int[] nums) {
        int cur=1;
        int pre =0;

        while(cur < nums.length){
            if(nums[cur] !=0 && nums[pre] ==0){
                nums[pre] = nums[cur];
                nums[cur] = 0;
                cur++;
                pre++;
            }else{
                cur++;
            }
            if(nums[pre] !=0){
                pre++;
            }
        }
    }
}