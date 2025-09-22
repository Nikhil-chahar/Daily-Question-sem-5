class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int Max = 0;
        for(Map.Entry<Integer, Integer> en : map.entrySet()) { 
            Max = Math.max(Max,en.getValue());
       }
       int count=0;
       for(Map.Entry<Integer, Integer> en : map.entrySet()) { 
            if(Max == en.getValue()){
                count+= Max;
            }
       }

       
       return count;

        
    }
}

