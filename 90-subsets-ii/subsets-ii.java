class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);

        subset(nums,0,ll,ans);
        return ans;
    }

    public void subset(int nums[],int ind,List<Integer> ll,List<List<Integer>> ans){
        // if(!ans.contains(ll)){
            ans.add(new ArrayList<>(ll));
        // }
           
        for(int i=ind;i<nums.length;i++){

            if(i > ind && nums[i] == nums[i-1]) continue;
            ll.add(nums[i]);
            subset(nums,i+1,ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}