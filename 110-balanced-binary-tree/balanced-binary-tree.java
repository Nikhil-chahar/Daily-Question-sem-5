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
        return isbalance(root).isbal;
    }
    public isBal isbalance(TreeNode root){
        if(root == null){
            return new isBal();
        }
        isBal left = isbalance(root.left);
        isBal right = isbalance(root.right);

        isBal self = new isBal();
        self.ht = Math.max(left.ht,right.ht)+1;
        boolean sb = Math.abs(left.ht - right.ht) <=1;
        self.isbal = sb && left.isbal && right.isbal;

        return self;
    }
    class isBal{
        int ht =-1;
        boolean isbal=true;
    }
}