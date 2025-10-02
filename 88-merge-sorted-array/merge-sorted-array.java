class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);

























        // int i=0,j=0,ind=0;

        // while(i < nums1.length && j< nums2.length){
        //     if(nums1[i] > nums2[j]){
        //         [ind++] = nums1[i];
        //         i++;
        //     }
        //     else if(nums1[i] == nums2[j]){
        //         arr[ind++] = nums2[j];
        //         j++;
        //     }
        // }
        // while(i < nums1.length){
        //     arr[ind++] = nums1[i];
        //     i++;
        // }
        // while(j < nums2.length){
        //     arr[ind++] = nums2[j];
        //     j++;
        // }
    }
}