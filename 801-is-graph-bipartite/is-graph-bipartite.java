class Solution {
    class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx,int dis){
            this.dis = dis;
            this.vtx = vtx;
        }
    }
    public boolean isBipartite(int[][] gra) {

        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<gra.length;i++){
            if(map.containsKey(i)){
                continue;
            }
            q.add(new BipartitePair(i,0));
            while(!q.isEmpty()){
                // remove
                BipartitePair bp = q.poll();
                // ignore
                if(map.containsKey(bp.vtx)){
                    if(map.get(bp.vtx) != bp.dis){
                        return false;
                    }
                    continue;
                }
                // visit
                map.put(bp.vtx,bp.dis);
                // work
                // add nbrs
                for(int nbrs : gra[bp.vtx]){
                    if(!map.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs,bp.dis+1));
                    }
                }
            }
        }
        return true;
    }
}