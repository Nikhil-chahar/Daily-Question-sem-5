class Solution {
    public int countBeautifulPairs(int[] nums) {
        
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){

                if(gcd(first(nums[i]),last(nums[j])) == 1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int first(int a){
        while(a > 9){
            a /=10;
        }
        return a;
    }
    public int last(int a){
        return a%10;
    }
    public int gcd(int a,int b){

        if(b ==0){
            return a;
        }
        return gcd(b,a%b);
    }
}