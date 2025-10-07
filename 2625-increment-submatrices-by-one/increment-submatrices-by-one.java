class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int mat[][] = new int[n][n];

        for(int i[] : mat){
            Arrays.fill(i,0);
        }

        for(int que[] : queries){
            int rmin=que[0];
            int cmin=que[1];
            int rmax=que[2];
            int cmax=que[3];

            for(int i=rmin;i<=rmax;i++){
                for(int j=cmin;j<=cmax;j++){
                    mat[i][j]++;
                }
            }

        }
        return mat;
    }
}