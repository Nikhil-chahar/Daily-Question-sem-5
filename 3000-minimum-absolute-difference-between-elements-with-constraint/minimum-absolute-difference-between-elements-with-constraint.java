class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int min = Integer.MAX_VALUE;

        for(int i=x;i<nums.size();i++){
            set.add(nums.get(i-x));

            Integer fl =  set.floor(nums.get(i));
            Integer cl = set.ceiling(nums.get(i));

            if(fl != null){
                min = Math.min(min,Math.abs(nums.get(i)-fl));
            }
            if(cl != null){
                min = Math.min(min,Math.abs(nums.get(i)-cl));
            }
        }
        return min;
    }
}