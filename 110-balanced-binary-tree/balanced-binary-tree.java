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
    public boolean isBalanced(TreeNode root) {
        return Balance(root).isbal;
    }
    public BalancePair Balance(TreeNode root){
        if(root == null){
            return new BalancePair();
        }
        BalancePair ldp = Balance(root.left);
        BalancePair rdp = Balance(root.right);
        BalancePair sdp = new BalancePair();
        sdp.ht = Math.max(ldp.ht,rdp.ht)+1;
        boolean sb = Math.abs(ldp.ht-rdp.ht) <=1;
        sdp.isbal = sb && ldp.isbal && rdp.isbal;

        return sdp;

    }
    class BalancePair{
        boolean isbal = true;
        int ht = -1;
    }
}