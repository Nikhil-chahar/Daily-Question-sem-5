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
        int max = -1;
        for(int num : nums){
            max = num>max?num:max;
        }
        boolean fre[] = new boolean[max+1];
        for(int num : nums) fre[num] = true;

        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(head != null){
            if(head.val >= fre.length || fre[head.val] == false){
                dummy.next = head;
                dummy = dummy.next;
            }
            head = head.next;
        }
        dummy.next = null;
        return temp.next;
    }

}