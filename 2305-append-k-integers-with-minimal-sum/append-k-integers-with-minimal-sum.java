class Solution {
    public long minimalKSum(int[] nums, int k) {
        long kth = k;
        long sum =(kth*(kth+1))/2;
        int las = -1;
        Arrays.sort(nums);

        for(int val : nums){
            if(val != las && val <=kth){
                sum -=val;
                kth++;
                sum+=kth;
                las = val;
            }
        }
        
        return sum;
    }
}