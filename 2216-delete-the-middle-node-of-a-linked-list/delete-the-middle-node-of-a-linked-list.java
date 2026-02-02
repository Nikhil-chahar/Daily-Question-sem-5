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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode tem = head;
        int ind =0;
        while(tem != null){
            ind++;
            tem = tem.next;
        }
        int m = ind/2;
        ind =1;
        tem = head;

        while(ind <=m){
            if(ind == m){
                tem.next = tem.next.next;
            }else{
                tem = tem.next;
            }
            ind++;
        }
        return head;
    }
}