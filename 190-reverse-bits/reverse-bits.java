class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=31;i>=0;i--){
            sb.append((n>>i)&1);
        }
        sb.reverse();
        // sb.append(Integer.toBinaryString(n));
        // System.out.print(sb);
        return (int)Integer.parseInt(sb.toString(),2);
    }
}