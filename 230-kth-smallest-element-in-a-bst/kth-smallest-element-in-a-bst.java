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
    List<Integer> ll = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        makeList(root);
        Collections.sort(ll);
        System.out.print(ll);
        return ll.get(k-1);
    }
    public void makeList(TreeNode root){
        if(root == null){
            return;
        }
        ll.add(root.val);
        makeList(root.left);
        makeList(root.right);
    }

}