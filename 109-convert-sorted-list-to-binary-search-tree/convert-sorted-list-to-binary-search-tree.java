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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ll = new ArrayList<>();
        makeList(head,ll);
        return tree(ll,0,ll.size()-1);
    }
    public TreeNode tree(List<Integer> ll,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode nn = new TreeNode(ll.get(mid));
        nn.left = tree(ll,si,mid-1);
        nn.right = tree(ll,mid+1,ei);
        return nn;
    }
    public void makeList(ListNode head,List<Integer> ll){

        while(head != null){
            ll.add(head.val);
            head = head.next;
        }
    }
}