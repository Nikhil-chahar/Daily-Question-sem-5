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
        return balance(root).isBal;
    }
    public balPair balance(TreeNode root){
        if(root == null){
            return new balPair();
        }
        balPair left = balance(root.left);
        balPair right = balance(root.right);

        balPair sbp = new balPair();
        boolean sb = Math.abs(left.ht - right.ht) <=1;
        sbp.ht = Math.max(left.ht,right.ht)+1;
        sbp.isBal = sb && left.isBal && right.isBal;

        return sbp;

    }
    class balPair{
        int ht=-1;
        boolean isBal = true;
    }
}