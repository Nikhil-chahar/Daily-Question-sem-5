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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return rec(root,target);
    }
    public TreeNode rec(TreeNode root,int tar){
        if(root == null){
            return null;
        }
        root.left = rec(root.left,tar);
        root.right = rec(root.right,tar);
        
        if(root.left == null && root.right == null && root.val == tar){
            return null;
        }
        

        return root;

    }
}