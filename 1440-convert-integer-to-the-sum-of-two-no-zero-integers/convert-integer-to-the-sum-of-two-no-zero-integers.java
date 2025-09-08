class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a =1;
        int b = n-a;
        int ans[] = new int[2];

        while(true){
            if(valid(a) && valid(b)){
                ans[0] = a;
                ans[1] = b;
                break;
            }
            else{
                a++;
                b--;
            }
        }
        return ans;
    }
    public boolean valid(int num){
        String s = String.valueOf(num);
        if(s.contains("0")){
            return false;
        }
        return true;
    }
}