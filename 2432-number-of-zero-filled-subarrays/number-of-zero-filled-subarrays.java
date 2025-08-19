class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long tc =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                long c=1;
                int j=i+1;
                while(j<nums.length && nums[j] == 0){
                    c++;
                    j++;
                }
                tc += count(c);
                i=j;
            }
        }
        return tc;
    }
    public long count(long c){
        long num=0;
        while(c !=0){
            num+=c;
            c--;
        }
        return num;
    }
}