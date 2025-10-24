class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int ind = findInd(nums2,nums1[i]);
            if(ind == -1){
                ans[i] = -1;
            }else{
                int nex = findGreat(nums2,nums1[i],ind);
                ans[i] = nex;
            }
        }
        return ans;
    }
    public int findGreat(int nums2[], int val,int ind){
        for(int i=ind;i<nums2.length;i++){
            if(val < nums2[i]) return nums2[i];
        }
        return -1;
    }
    public int findInd(int nums2[],int val){
        for(int i=0;i<nums2.length;i++){
            if(val == nums2[i]) return i;
        }
        return -1;
    }
}