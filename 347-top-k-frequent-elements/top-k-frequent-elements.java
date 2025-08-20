class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ll = new ArrayList<>();
        LinkedHashMap<Integer, Integer> sortedMap = map.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // compare values
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            )
        );
        
        int ans[] = new int[k];
        for(int key : sortedMap.keySet()){
            if(k-- > 0){
                ll.add(key);
            }
        }
        System.out.print(ll);
        for(int i=0;i<ans.length;i++){
            ans[i] = ll.get(i);
        }
        
        return ans;
    }
}