class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        // ll.add(nums[0]);

        permu(nums,ll,ans);
        return ans;
    }
    public void permu(int nums[],List<Integer> ll,List<List<Integer>> ans){
        if(ll.size() == nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int j =0;j<nums.length;j++){
            if(!ll.contains(nums[j])){
                ll.add(nums[j]);
                permu(nums,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}