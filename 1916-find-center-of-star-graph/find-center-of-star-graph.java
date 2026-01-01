class Solution {
    public int findCenter(int[][] edges) {

        int ed = edges.length + 1;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0; i <= ed; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] val : edges){
            int u = val[0];
            int v = val[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int max = 0, ans = 0;
        for(int i = 1; i <= ed; i++){
            if(graph.get(i).size() > max){
                max = graph.get(i).size();
                ans = i;
            }
        }
        return ans;
    }
}
