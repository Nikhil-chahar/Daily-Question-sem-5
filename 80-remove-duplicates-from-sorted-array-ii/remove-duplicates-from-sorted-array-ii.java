class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int key : map.keySet()){
            if(map.get(key) >2){
                sum +=2;
            }else{
                sum += map.get(key);
            }
        }
        int ind=0;
        int i=0;
        for(int key : map.keySet()){
            if(map.get(key) >1){
                nums[ind++] = key;
                nums[ind++] = key;
            }else{
                nums[ind++] = key;
            }
        }
        System.out.print(map);
        return sum;
    }
}