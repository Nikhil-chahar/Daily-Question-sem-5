class Solution {
    public String largestGoodInteger(String num) {
        int max =Integer.MIN_VALUE;
        String ans = "";
        for(int i=0;i<=num.length()-3;i++){
            String s = num.substring(i,i+3);
            if(check(s)){
                System.out.println(s);
                int val = Integer.parseInt(s);
                if(val >= max){
                    max = val;
                    ans  = s;
                }
            }
        }
        return ans;
    }
    public boolean check(String s){
        char ch = s.charAt(0);
        if(ch == s.charAt(1) && ch == s.charAt(2)) return true;
        return false;
    }
}