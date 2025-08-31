class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i=0,j=0;
        long sum1=0,sum2=0;
        long ans=0;

        while(i<nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                sum1 += nums1[i];
                i++;
            }
            else if(nums1[i] > nums2[j]){
                sum2 += nums2[j];
                j++;
            }
            else{
                sum1+=nums1[i];
                sum2 += nums2[j];
                ans  = ans + Math.max(sum1,sum2);
                sum1 = 0;
                sum2 =0;
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            sum1+=nums1[i];
            i++;
        }
        while(j<nums2.length){
            sum2+=nums2[j];
            j++;
        }
        ans = ans + Math.max(sum1,sum2);
        System.out.print(sum1 +" " + sum2);
        return (int)(ans%1000_000_007);
    }
}