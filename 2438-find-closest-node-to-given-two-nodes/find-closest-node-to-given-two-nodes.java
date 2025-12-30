class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int dist1[] = new int[n];
        int dist2[] = new int[n];

        Arrays.fill(dist1,-1);
        Arrays.fill(dist2,-1);

        dfs(edges,node1,dist1,0);
        dfs(edges,node2,dist2,0);

        int ans=-1;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(dist1[i] !=-1 && dist2[i] != -1){
                int min = Math.max(dist1[i],dist2[i]);

                if(max > min){
                    max = min;
                    ans=i;
                }
            }
        }
        return ans;


    }
    public void dfs(int edges[],int node,int dist[],int dis){
        if(node == -1 || dist[node] != -1){
            return;
        }
        dist[node] = dis;
        dfs(edges,edges[node],dist,dis+1);

    }
}