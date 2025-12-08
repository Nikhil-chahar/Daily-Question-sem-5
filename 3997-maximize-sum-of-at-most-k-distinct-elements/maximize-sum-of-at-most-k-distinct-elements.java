class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int num : nums){
            set.add(num);
        }
        // System.out.print(set);
        int size = Math.min(set.size(),k);
        int ans[] = new int[size];
        int ind=0;

        for(int val :set){
            if(ind < size){
               ans[ind++] = val; 
            }
        }
        return ans;
        
    }
}