class Solution {
    public  HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
    public int[] findOrder(int num, int[][] pre) {
        for(int i=0;i<num;i++){
            map.put(i,new HashMap<>());
        }

        for(int i=0;i<pre.length;i++){
            int v2 = pre[i][0];
            int v1 = pre[i][1];
            map.get(v1).put(v2,0);

        }

        if(!isFinish()){
            return new int[0];
        }
        List<Integer> ll = new ArrayList<>();

        isfinish(ll);
        int ans[] = new int[ll.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = ll.get(i);
        }
        return ans;

    }
    public void isfinish(List<Integer> ll) {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		// int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
            ll.add(r);

			// c++;
			for (int nbrs : map.get(r).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}

	}
    public boolean isFinish() {
		int[] in = indegree();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
            // ll.add(r);

			c++;
			for (int nbrs : map.get(r).keySet()) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
        return c == map.size();

	}

    public  int[] indegree(){
        int in[] = new int[map.size()];

        for(int key : map.keySet()){
            for(int nbrs : map.get(key).keySet()){
                in[nbrs]++;
            }
        }
        return in;
    }
}