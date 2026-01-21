class Solution {
    public boolean doesValidArrayExist(int[] der) {
        int xor = 0;
        for(int v : der){
            xor ^= v;
        }
        return xor==0;

    }
}