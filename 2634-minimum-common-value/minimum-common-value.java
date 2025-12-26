class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int key : set1){
            if(set2.contains(key)){
                return key;
            }
        }
        return -1;
    }
}