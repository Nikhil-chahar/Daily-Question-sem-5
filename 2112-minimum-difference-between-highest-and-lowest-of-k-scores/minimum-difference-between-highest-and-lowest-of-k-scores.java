class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int mn = Integer.MAX_VALUE;

        for (int i = 0; i + k - 1 < nums.length; i++) {
            mn = Math.min(mn, nums[i + k - 1] - nums[i]);
        }
        return mn;
    }
}
