class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = 0;
        for(int v : arr1){
            xor1 ^=v;
        }
        int xor2 = 0;
        for(int v : arr2){
            xor2 ^=v;
        }
        return xor1&xor2;
    }
}