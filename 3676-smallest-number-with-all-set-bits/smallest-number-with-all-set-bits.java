class Solution {
    public int smallestNumber(int n) {
        String s = Integer.toBinaryString(n);
        int val =0;
        int i=0;
        while(i < s.length()){
            val = val*2 +1;
            i++;
        }
        // String s1 = Integer.toDecimalString(val);
        return val ;
    }
}