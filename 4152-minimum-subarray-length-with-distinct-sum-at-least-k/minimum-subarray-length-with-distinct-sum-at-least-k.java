class Solution {
    public int minLength(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int le = 0;
        int diSum = 0;

        for(int ri = 0; ri < nums.length; ri++) {
            map.put(nums[ri], map.getOrDefault(nums[ri], 0) + 1);
            if (map.get(nums[ri]) == 1) {
                diSum += nums[ri];
            }
            while(diSum >= k) {
                res = Math.min(res, ri - le + 1);

                map.put(nums[le], map.get(nums[le]) - 1);
                if (map.get(nums[le]) == 0) {
                    diSum -= nums[le];
                }
                le++;
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
