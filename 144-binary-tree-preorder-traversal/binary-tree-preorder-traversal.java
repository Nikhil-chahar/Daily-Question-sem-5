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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        makePreorder(root,ll);
        return ll;
    }
    public void makePreorder(TreeNode root,List<Integer> ll){
        if(root == null){
            return;
        }
        ll.add(root.val);
        makePreorder(root.left,ll);
        makePreorder(root.right,ll);
    }
}