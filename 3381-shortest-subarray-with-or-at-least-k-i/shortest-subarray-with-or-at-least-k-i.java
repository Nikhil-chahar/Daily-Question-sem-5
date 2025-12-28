class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int min = nums.length+1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                if(check(i,j,k,nums)){
                    min = Math.min(min,(j-i));
                }
            }
        }
        return min == nums.length+1 ? -1 : min;
    }
    public boolean check(int st,int en, int k,int[] nums){
        int OR =0;
        for(int i=st;i<en;i++){
            OR |= nums[i];
        }
        return OR >=k? true:false;
    }
}