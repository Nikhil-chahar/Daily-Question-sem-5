class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int max = nums[n-1]*nums[n-2]*nums[n-3];
        int max2 = nums[n-1] *nums[0]*nums[1];
        return Math.max(max,max2);
    }
}