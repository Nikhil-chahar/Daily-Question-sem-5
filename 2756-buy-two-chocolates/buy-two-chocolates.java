class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int m = money;
        int c=0;
        for(int i=0;i<prices.length;i++){
            if(money >= prices[i]){
                money -=prices[i];
                c++;
            }
            if(c==2){
                break;
            }
        }
        if(c ==2 && money >=0){
            return money;
        }
        return m;

    }
}