class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cur = 0;

            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                cur = Math.max(cur, dp[st.pop()]);
            }

            if (!st.isEmpty()) {
                dp[i] = cur + 1;
                ans = Math.max(ans, dp[i]);
            }

            st.push(i);
        }
        return ans;
    }
}
