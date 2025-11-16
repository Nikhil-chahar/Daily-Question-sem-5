class Solution {
    public int numSub(String s) {
        long sum = 0, curr = 0;
        long mod = 1000000007;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                curr++;
                sum = (sum + curr) % mod;
            }else{
                curr=0;
            }
        }
        return (int)sum;
    }
}