class Solution {
    public int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];

        // ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // int ed = edges.length+1;
        // for(int i=1;i<=ed;i++){
        //     graph.add(i,new ArrayList<>()); 
        // }

        // for(int val[] : edges){
        //     int u = val[0];
        //     int v = val[1];
        //     graph.get(u).add(v);
        //     graph.get(v).add(u);
        // }
        // int max=0;
        // int ans=0;
        // for(int i=1;i<ed;i++){
        //     int cnt =0;
        //     for(int val : graph.get(i)){
        //         cnt++;

        //     }

        // }
    }
}