class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> set = new ArrayList<>();
        for(int v : nums){
            if(!set.contains(v)){
                set.add(v);
            }
        }

        for(int i=0;i<set.size();i++){
            nums[i] = set.get(i);
        }
        return set.size();
    }
}