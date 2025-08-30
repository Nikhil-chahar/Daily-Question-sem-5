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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
    public diaPair diameter(TreeNode root){
        if(root == null){
            return new diaPair();
        }
        diaPair left = diameter(root.left);
        diaPair right = diameter(root.right);
        diaPair sd = new diaPair();
        sd.ht = Math.max(left.ht,right.ht)+1;
        int sdp = left.ht +right.ht+2;
        sd.dia = Math.max(sdp,Math.max(left.dia,right.dia));
        return sd;
    }
    class diaPair{
        int ht=-1;
        int dia =0;
    }
}