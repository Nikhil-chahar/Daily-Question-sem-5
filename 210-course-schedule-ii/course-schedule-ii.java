class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    public int[] findOrder(int n, int[][] pr) {
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int ar[] : pr){
            int v1 = ar[0];
            int v2 = ar[1];
            map.get(v2).add(v1);
        }
        Queue<Integer> q = new LinkedList<>();
        int in[] = indegree(n);

        for(int i=0;i<n;i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        int c=0;
        int ans[] = new int[n];
        int i=0;

        while(!q.isEmpty()){
            int rv = q.poll();
            ans[i++] = rv;

            c++;
            for(int nbrs : map.get(rv)){
                in[nbrs]--;
                if(in[nbrs] == 0){
                    q.add(nbrs);
                }
            }
        }
        if(c != n) return (new int[]{});
        return ans;

    }
    public int[] indegree(int n){
        int in[] = new int[n];

        for(int key : map.keySet()){
            for(int nbrs : map.get(key)){
                in[nbrs]++;
            }
        }
        return in;
    }
}