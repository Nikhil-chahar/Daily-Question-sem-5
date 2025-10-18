class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int last = Integer.MIN_VALUE;

        for(int num : nums){
            int val = Math.max(num-k,last+1);
            if(val <= num+k){
                set.add(val);
                last = val;
            }
        }
        return set.size();
    }
}