class Solution {
    int[][] dp; // Memoization table
    
    public int maxOperations(int[] nums) {
        int n = nums.length;
        dp = new int[n][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        
        int ans = 0;
        
        // Try all three possible first operations:
        // Case 1: Remove first two elements
        ans = Math.max(ans, 1 + solve(2, n - 1, nums, nums[0] + nums[1]));
        
        // Case 2: Remove last two elements  
        ans = Math.max(ans, 1 + solve(0, n - 3, nums, nums[n - 1] + nums[n - 2]));
        
        // Case 3: Remove first and last elements
        ans = Math.max(ans, 1 + solve(1, n - 2, nums, nums[0] + nums[n - 1]));
        
        return ans;
    }
    
    private int solve(int i, int j, int[] nums, int sum) {
        // Base case: not enough elements
        if (i >= j) return 0;
        
        // Check memoization
        if (dp[i][j] != -1) return dp[i][j];
        
        int ans = 0;
        
        // Option 1: Remove first two elements of current subarray
        if (nums[i] + nums[i + 1] == sum) {
            ans = Math.max(ans, 1 + solve(i + 2, j, nums, sum));
        }
        
        // Option 2: Remove first and last elements of current subarray
        if (nums[i] + nums[j] == sum) {
            ans = Math.max(ans, 1 + solve(i + 1, j - 1, nums, sum));
        }
        
        // Option 3: Remove last two elements of current subarray
        if (nums[j] + nums[j - 1] == sum) {
            ans = Math.max(ans, 1 + solve(i, j - 2, nums, sum));
        }
        
        // Memoize and return
        return dp[i][j] = ans;
    }
}