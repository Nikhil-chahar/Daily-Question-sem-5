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
    
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        ArrayList<Integer> ll = new ArrayList();
        list(root,ll);

        
        TreeNode curr = root;
        for (int i = 1; i < ll.size(); i++) {
            curr.left = null;
            curr.right = new TreeNode(ll.get(i));
            curr = curr.right;
        }
        // makeTree(root,ll,0);
        System.out.print(ll);

    }
    public void makeTree(TreeNode root,ArrayList<Integer> ll,int ind){
        if(root == null && ll.size()-1 == ind){
            return;
        }
        if(root == null){
            TreeNode node = new TreeNode();
            node.val = ll.get(ind);
            root.left = node;
            makeTree(root,ll,ind+1);
        }
        root.val = ll.get(ind);
        makeTree(root.right,ll,ind+1);
    }
    public void list(TreeNode root,ArrayList<Integer> ll){
        if(root == null){
            return;
        }
        ll.add(root.val);
        list(root.left,ll);
        list(root.right,ll);
    }
}