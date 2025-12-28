class Solution {
    public long maximumSubsequenceCount(String t, String pat) {
        char a = pat.charAt(0);
        char b = pat.charAt(1);
        if(a == b){
            long cnt =0;
            for(char ch : t.toCharArray()){
                if(ch == a){
                    cnt++;
                }
            }
            cnt++;
            return cnt*(cnt-1)/2;
        }

        long A = 0;
        long B = 0;
        long base =0;

        for(char ch : t.toCharArray()){
            if(ch == a){
                A++;
            }
            else if(ch == b){
                base += A;
                B++;
            }
        }

        return Math.max(A+base,B+base);
        
    }
}