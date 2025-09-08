class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> ll = new ArrayList<>();
        for(int val : set){
            ll.add(val);
        }

        int ans =1;
        int c=1;

        for(int i=0;i<ll.size()-1;i++){
            if(ll.get(i) +1 == ll.get(i+1)){
                c++;
            }else{
                c=1;
            }
            ans = Math.max(c,ans);
        }
        return ans;
    }
}