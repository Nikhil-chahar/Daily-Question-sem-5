class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i : row){
            makeRowZero(i,matrix);
        }
        for(int j : col){
            makeColZero(j,matrix);
        }

    }

    public void makeRowZero(int row,int[][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i] =0;
        }
    }
    public void makeColZero(int col,int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] =0;
        }
    }
}