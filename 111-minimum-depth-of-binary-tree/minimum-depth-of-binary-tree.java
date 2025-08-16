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
    public int minDepth(TreeNode root) {
        return min(root);
    }
    public int min(TreeNode root){
        if(root == null){
            return 0;
        }
        int lmax = min(root.left);
        int rmax = min(root.right);
        return (lmax == 0 || rmax == 0) ? lmax + rmax +1 : Math.min(lmax,rmax)+1;
    }
}