class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length,m= nums2.length;
        if(n%2 == 0 && m%2==0){
            return 0;
        }
        int xor1 = bit_xor(nums1);
        int xor2 = bit_xor(nums2);
        if(n%2 == 1 && m%2==1){
            return xor1^xor2;
        }
        else if(n%2 == 1 ){
            return xor2;
        }
        return xor1;
    }
    public int bit_xor(int nums[]){
        int x = 0;
        for(int v : nums){
            x^=v;
        }
        return x;
    }
}