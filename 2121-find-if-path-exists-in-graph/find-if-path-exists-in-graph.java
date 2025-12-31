class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        for(int ar[] : edges){
            int a = ar[0];
            int b = ar[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        HashSet<Integer> set = new HashSet();

        if(dfs(src,des,graph,set)){
            return true;
        }
        return false;
    }
    public boolean dfs(int src,int des,ArrayList<ArrayList<Integer>> graph,HashSet<Integer> set){

        if(src == des){
            return true;
        }
        set.add(src);

        for(int nbrs : graph.get(src)){
            if(!set.contains(nbrs)){
                boolean ans = dfs(nbrs,des,graph,set);
                if(ans){
                    return true;
                }
            }
        }
        return false;
    }
}