class Solution {
    public int maxRepeating(String seq, String w) {
        int c=0;
        String s = w;

        while(seq.indexOf(s) != -1){
            s+=w;
            c++;
        }
        return c;
    }
}