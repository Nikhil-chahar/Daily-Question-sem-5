class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> e = new HashSet<>();
            HashSet<Integer> o = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    e.add(nums[j]);
                } else {
                    o.add(nums[j]);
                }

                if (e.size() == o.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}