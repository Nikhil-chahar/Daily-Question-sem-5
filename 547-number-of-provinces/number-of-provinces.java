class Solution {
    public int findCircleNum(int[][] con) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int c =0;
        int v = con.length;
        for(int i=0;i<v;i++) graph.add(i,new ArrayList<>());
        
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(i != j && con[i][j] ==1){
                    graph.get(i).add(j);
                }
            }
        }
        int vis[] = new int[v];
        
        for(int i=0;i<v;i++){
            if(vis[i] == 0){
                dfs(vis,i,graph);
                c++;
            }
        }
        return c;
    }
    public void dfs(int vis[],int ind,ArrayList<ArrayList<Integer>> graph){
        vis[ind] =1;
        for(int val : graph.get(ind)){
            if(vis[val] ==0){
                dfs(vis,val,graph);
            }
        }
    }
}
