class Solution {
    public int longestBalanced(String s) {
        int mx=0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                if(balance(freq)){
                    mx = Math.max(mx,j-i+1);
                }
            }
        }
        return mx;
    }
    public boolean balance(int freq[]){
        int val =0;
        // int cn=0;

        for(int v : freq){
            if(v > 0){
                if(val == 0) val = v;
                else if(val != v) return false;
                // cn++;
            }
        }
        // return cn >0;
        return true;
    }
}