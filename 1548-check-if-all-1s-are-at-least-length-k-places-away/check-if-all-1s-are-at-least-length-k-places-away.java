class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int gap= k;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(gap< k){
                    return false;
                } 
                gap=0;
            }else{
                gap++;
            }
        }
        return true;
    }
}