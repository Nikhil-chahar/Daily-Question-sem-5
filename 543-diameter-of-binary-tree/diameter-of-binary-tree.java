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
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root);
    }
    public int dia(TreeNode root){
        if(root == null){
            return 0;
        }
        int ld = dia(root.left);
        int rd = dia(root.right);

        int sd = ht(root.left) + ht(root.right)+2;

        return Math.max(sd,Math.max(ld,rd));
    }
    public int ht(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = ht(root.left);
        int right = ht(root.right);

        return Math.max(left,right)+1;
    }
}