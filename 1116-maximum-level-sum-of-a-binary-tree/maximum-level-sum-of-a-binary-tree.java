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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max =Integer.MIN_VALUE;
        int ind = -1;
        int i=1;
        while(!q.isEmpty()){
            int size = q.size();
            int sum =0;
            while(size-- > 0){
                TreeNode nn = q.poll();
                sum += nn.val;
                if(nn.left != null){
                    q.add(nn.left);
                }
                if(nn.right != null){
                    q.add(nn.right);
                }
            }
            if(sum > max){
                max = sum;
                ind = i;
            }
            i++;
        }
        return ind;
    }
}