class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int i=0,j=0,ind=0;

        while(i < nums1.length && j< nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[ind++] = nums1[i];
                i++;
            }
            else{
                arr[ind++] = nums2[j];
                j++;
            }
        }
        while(i < nums1.length){
            arr[ind++] = nums1[i];
            i++;
        }
        while(j < nums2.length){
            arr[ind++] = nums2[j];
            j++;
        }

        if(arr.length%2 == 0){
            int mid = arr.length/2;
            return ((double)(arr[mid]+arr[mid-1]))/2;
            // return ans;
        }

        int mid = arr.length/2;
        return (double)(arr[mid]);

    }
}