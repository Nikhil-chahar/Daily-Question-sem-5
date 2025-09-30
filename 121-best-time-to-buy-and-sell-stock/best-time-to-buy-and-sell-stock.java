class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPro = 0;
        for(int i=1;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);

            maxPro = Math.max(maxPro,prices[i]-minPrice);
        }
        return maxPro;
    }
}