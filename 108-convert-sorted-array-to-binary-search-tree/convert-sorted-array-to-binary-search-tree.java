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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }
    public TreeNode tree(int nums[],int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode nn = new TreeNode(nums[mid]);
        nn.left = tree(nums,si,mid-1);
        nn.right = tree(nums,mid+1,ei);

        return nn;
    }
}