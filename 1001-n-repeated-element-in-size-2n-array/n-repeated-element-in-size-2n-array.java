class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) >= n/2){
                return key;
            }
        }
        return -1;

    }
}