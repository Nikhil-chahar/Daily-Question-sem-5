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
    public int sumNumbers(TreeNode root) {
        List<Integer> ll = new ArrayList<>();

        helper(root,0,ll);
        int sum=0;
        for(int num : ll){
            sum +=num;
        }
        return sum;
    }
    public void helper(TreeNode root,int sum, List<Integer> ll){
        if(root == null){
            return ;
        }
        sum += root.val;
        if(root.left == null && root.right == null){
            ll.add(sum);
        }

        helper(root.left, sum*10,ll);
        helper(root.right,sum*10,ll);

        sum -=root.val;
    }
}