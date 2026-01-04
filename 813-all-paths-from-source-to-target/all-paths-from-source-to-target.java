class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> ll = new ArrayList<>();
        ll.add(0);
        dfs(0,graph,ll);
        return ans;
    }
    public void dfs(int val, int graph[][],List<Integer> ll){
        if(val == graph.length-1){
            // ll.add(val);
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int nbrs : graph[val]){
            ll.add(nbrs);
            dfs(nbrs,graph,ll);
            ll.remove(ll.size()-1);
        }
    }
}