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
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        make(root,ll);
        System.out.print(ll);
        List<Integer> ans = new ArrayList<>();
        // int ind =0;
        for(List<Integer> nl :ll){
            int max = nl.get(0);
            for(int i=1;i<nl.size();i++){
                if(max<nl.get(i)){
                    max = nl.get(i);
                }
            }
            ans.add(max);
            // System.out.print(nl);
        }
        return ans;
    }
    public void make(TreeNode root, List<List<Integer>> ll){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> nl = new ArrayList<>();
            int si = q.size();
            for(int i=0;i<si;i++){
                TreeNode rv = q.poll();
                nl.add(rv.val);
                if(rv.left != null){
                    q.add(rv.left);
                }
                if(rv.right != null){
                    q.add(rv.right);
                }
            }
            ll.add(nl);
        }
    }
}