
class Solution {
    public boolean solve(TreeNode root, long minv, long maxv){
        if (root == null) return true;
        if (root.val <= minv || root.val >= maxv) return false;

        return solve(root.left, minv, root.val) &&
               solve(root.right, root.val, maxv);
    }

    public boolean isValidBST(TreeNode root){
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}