class Solution {
    public int[] singleNumber(int[] arr) {
        int xor = 0;
        for(int v : arr){
            xor ^=v;
        }
        int mask = (xor&(-1*xor)); 
        int a=0;
        for(int i=0;i<arr.length;i++){
            if((mask & arr[i]) != 0){
                a ^= arr[i];
            }
        }
        int b = xor^a;
        return new int[]{a,b};
    }
}