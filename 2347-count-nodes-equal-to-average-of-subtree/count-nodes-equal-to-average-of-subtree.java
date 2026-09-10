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
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        find(root);
        return ans;
    }
    public pair find(TreeNode root){
        if(root == null){
            return new pair(0,0);
        }
        if(root.left == null && root.right == null){
            ans++;
            return new pair(1,root.val);
        }
        pair left = find(root.left);
        pair right = find(root.right);

        int cntN = left.n+right.n+1;
        int sumN = left.sum+right.sum+root.val;

        if(sumN/cntN == root.val){
            ans++;
        }
        return new pair(cntN,sumN);

    }
    class pair{
        int n;
        int sum;
        public pair(int n,int sum){
            this.n = n;
            this.sum = sum;
        }
    }
}