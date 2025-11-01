/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        Arrays.sort(nums);

        while(head != null){
            if(!checked(head.val,nums)){
                dummy.next = head;
                dummy = dummy.next;
            }
            head = head.next;
        }
        dummy.next = null;
        return temp.next;

    }
    public boolean checked(int tar,int nums[]){
        int lo = 0;
        int hi = nums.length-1;

        while(lo <= hi){
            int  mid = lo+(hi-lo)/2;
            if(nums[mid] == tar){
                return true;
            }
            else if(nums[mid] > tar){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return false;
    }
}