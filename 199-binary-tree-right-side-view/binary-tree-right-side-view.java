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
    public int maxd = 0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        // ll.add(root.val);
        helper(root,ll,1);
        return ll;
    }
    public void helper(TreeNode root , List<Integer> ll,int cl){
        if(root == null){
            return;
        }
        if(maxd < cl){
            ll.add(root.val);
            maxd = cl;
        }
        helper(root.right,ll,cl+1);
        helper(root.left,ll,cl+1);
    }
}