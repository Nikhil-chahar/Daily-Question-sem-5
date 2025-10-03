class Solution {
    public int characterReplacement(String s, int k) {
        int left =0,right=0,maxC=0,res=0;
        int freq[] = new int[26];

        while(right < s.length()){
            char ch = s.charAt(right);
            freq[ch -'A']++;

            maxC = Math.max(maxC,freq[ch-'A']);

            while((right-left +1)- maxC > k){
                freq[s.charAt(left) -'A']--;
                left++;
            }

            res = Math.max(res,right-left+1);

            right++;
        }
        return res;
    }
}