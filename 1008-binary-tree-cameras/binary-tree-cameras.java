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
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = minCamera(root);
        if(c == -1){
            camera++;
        }
        return camera;

    }
    public int minCamera(TreeNode root){
        if(root == null){
            return 0; // camera required
        }
        int left = minCamera(root.left);
        int right = minCamera(root.right);

        if(left == -1 || right == -1){
            camera++;
            return 1; // 1=>camera set up
        } 
        else if(left == 1 || right == 1){ // kisi ek ke pass ya dono ke pass camera h ya dono
            return 0; // iska mtlb m covered hu
        }else{
            return -1;
        }

    }
}