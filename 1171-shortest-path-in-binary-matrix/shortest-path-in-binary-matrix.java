class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int dis[][] = {{1,0},{1,1},{0,1},{-1,-1},{-1,0},{0,-1},{-1,1},{1,-1}};
        int n=grid.length-1;
        int m = grid[0].length-1;
        if(grid[0][0] == 1 || grid[n][m] == 1){
            return -1;
        }
        if(n==0) return 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        int dist=1;
        while(!q.isEmpty()){
            int size=q.size();
            dist++;
            while(size>0){
            int tem[] = q.poll();
            int r = tem[0];
            int c = tem[1];
            for(int val[] : dis){
                int nr = r + val[0];
                int nc = c + val[1];

                if(nr >=0 && nc >=0 && nr <=n && nc <= m && grid[nr][nc] == 0){
                    if(nr==n && nc==m) return dist; 
                    q.add(new int[]{nr,nc});
                    grid[nr][nc] = dist +1;
                }
            }
            size--;
            }
        }
        return -1;

    }
}