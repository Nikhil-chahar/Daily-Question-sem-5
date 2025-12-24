class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int val : apple){
            sum+=val;
        }

        int ans=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            if(sum <= 0){
                break;
            }
            sum -= capacity[i];
            ans++;
        }
        return ans;
    }
}