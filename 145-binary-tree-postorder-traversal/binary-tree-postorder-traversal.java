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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        make(root,ll);
        return ll;
    }
    public void make(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        make(root.left,ll);
        make(root.right,ll);
        ll.add(root.val);
    }
}