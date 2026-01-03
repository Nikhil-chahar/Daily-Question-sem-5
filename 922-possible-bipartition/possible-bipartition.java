class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        Queue<Pair> q = new LinkedList<>();

        for(int val[] : dislikes){
            int a = val[0];
            int b = val[1];
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for(int i=1;i<=n;i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new Pair(i,0));

            while(!q.isEmpty()){
                Pair rp = q.poll();

                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.dis){
                        return false;
                    }
                    continue;
                }
                visited.put(rp.vtx,rp.dis);

                for(int nbrs : map.get(rp.vtx)){
                    if(!visited.containsKey(nbrs)){
                        q.add(new Pair(nbrs,rp.dis+1));
                    }
                }

            }
        }
        return true;
    }
    class Pair{
        int vtx;
        int dis;
        public Pair(int vtx,int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}