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
    public int maxDepth(TreeNode root) {
        return max(root);
    }
    public int max(TreeNode root){
        if(root == null){
            return 0;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);
        return Math.max(lmax,rmax)+1;
    }
}