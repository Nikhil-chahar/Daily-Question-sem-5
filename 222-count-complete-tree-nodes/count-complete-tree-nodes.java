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
    public int countNodes(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        make(root,ll);
        return ll.size();
    }
    public void make(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        ll.add(root.val);
        make(root.left,ll);
        make(root.right,ll);
    }
}