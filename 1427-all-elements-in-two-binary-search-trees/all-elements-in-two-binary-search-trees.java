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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ll = new ArrayList<>();
        make(root1,ll);
        make(root2,ll);
        Collections.sort(ll);
        return ll;
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