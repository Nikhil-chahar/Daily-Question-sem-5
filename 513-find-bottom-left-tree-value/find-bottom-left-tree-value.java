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
    int left =0;
    int ml =0;
    public int findBottomLeftValue(TreeNode root) {
        leftside(root,1);

        return left;
    }
    public void leftside(TreeNode root,int cl){
        if(root == null){
            return;
        }
        if(ml < cl){
            left = root.val;
            ml = cl;
        }
        leftside(root.left,cl+1);
        leftside(root.right,cl+1);
    }
}