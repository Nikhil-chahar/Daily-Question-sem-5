class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int v : nums){
            sum += value(v);
        }
        return sum;
    }
    public int value(int v){
        int sum=0;
        int cnt = 0;
        for(int i=1;i*i<=v;i++){
            if(v%i == 0){
                int d1 = i;
                int d2 = v/i;
                if(d1 == d2){
                    sum += d1;
                    cnt++;
                }else{
                    cnt+=2;
                    sum += d1+d2;
                }
            }
            if(cnt > 4) return 0;
        }
        return cnt==4?sum:0;
    }
}