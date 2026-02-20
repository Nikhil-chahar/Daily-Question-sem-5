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
    List<Integer> ll  = new ArrayList<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        allEle(root);
        System.out.print(ll);
        List<List<Integer>> ans = new ArrayList<>();
        for(int q :queries){
            int cl = ceilVal(q);
            int fl = Flor(q); 
            ans.add(Arrays.asList(fl, cl));
        }

        return ans;
    }
    public int ceilVal(int v){
        int mx=-1;
        int lo =0;
        int hi = ll.size()-1;

        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            int val = ll.get(mid);
            if(val >= v){
                hi = mid-1;
                mx = val;
            }else{
                lo = mid+1;
            }
        }
        return mx;
    }
    public int Flor(int v){
        int mx=-1;
        int lo =0;
        int hi = ll.size()-1;

        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            int val = ll.get(mid);
            if(val <= v){
                mx = val;
                lo = mid + 1;
            }else{
                hi = mid-1;
            }
        }
        return mx;
    }
    public void allEle(TreeNode root){
        if(root == null){
            return;
        }
        allEle(root.left);
        ll.add(root.val);
        allEle(root.right);
    }
}