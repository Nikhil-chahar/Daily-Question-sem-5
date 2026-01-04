class Solution {
    class Pair {
        int v;
        long cost;
        public Pair(int v, long cost) {
            this.v = v;
            this.cost = cost;
        }
    }
    public int countPaths(int n, int[][] roads) {
        int mod = 1_000_000_007;

        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new HashMap<>());
        }

        for (int[] ar : roads) {
            int v1 = ar[0];
            int v2 = ar[1];
            int cost = ar[2];
            graph.get(v1).put(v2, cost);
            graph.get(v2).put(v1, cost);
        }

        PriorityQueue<Pair> q = new 
                    PriorityQueue<>((a,b) -> Long.compare(a.cost,b.cost));
        
        int ways[] = new int[n];
        long dis[] = new long[n];
        Arrays.fill(dis,Long.MAX_VALUE);
        ways[0] =1;
        dis[0] = 0;
        q.add(new Pair(0,0));

        while(!q.isEmpty()){
            Pair rp = q.poll();
            int u = rp.v;
            long cuCost = rp.cost;

            if(cuCost > dis[u]) continue;

            for(int nbrs : graph.get(u).keySet()){
                long newCost = cuCost + graph.get(u).get(nbrs);

                if(newCost < dis[nbrs]){
                    dis[nbrs] = newCost;
                    ways[nbrs] = ways[u];
                    q.add(new Pair(nbrs,newCost));
                }
                else if(newCost == dis[nbrs]){
                    ways[nbrs] = (ways[nbrs]+ways[u])%mod;
                }
            }
        }
        return ways[n-1];        
    }
}