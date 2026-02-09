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
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return createNode(0,ll.size()-1);
    }
    public TreeNode createNode(int left,int right){
        if(left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(ll.get(mid));
        root.left = createNode(left,mid-1);
        root.right = createNode(mid+1,right);

        return root;
    }
     
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        ll.add(root.val);
        inorder(root.right);
    }
}