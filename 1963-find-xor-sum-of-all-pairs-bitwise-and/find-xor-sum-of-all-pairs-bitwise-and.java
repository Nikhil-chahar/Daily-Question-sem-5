class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor = 0;
        for(int v : arr1){
            xor ^=v;
        }
        int ans = 0;
        for(int v : arr2){
            ans ^= (v&xor);
        }
        return ans;
    }
}