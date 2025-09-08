class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ll = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }

        for(int key : map1.keySet()){
            int min = Math.min(map1.get(key),map2.getOrDefault(key,0));
            for(int i=0;i<min;i++){
                ll.add(key);
            }
        }
        int ans[] = new int[ll.size()];

        for(int i=0;i<ll.size();i++){
            ans[i] = ll.get(i);
        }
        return ans;

    }
}