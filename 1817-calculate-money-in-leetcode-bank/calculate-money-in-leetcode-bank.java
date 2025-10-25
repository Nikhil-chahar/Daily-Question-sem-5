class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int Tday=1,amount=1,Cday=1;
        while(Tday<=n){
            sum+=amount;
            amount++;
            if(Cday/7 >=1){
                amount = 1 + Tday/7;
                Cday=0;
            }
            Cday++;
            Tday++;
        }
        return sum;
    }
}
