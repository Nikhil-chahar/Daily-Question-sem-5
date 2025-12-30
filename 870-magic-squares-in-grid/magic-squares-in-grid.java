class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int all=0;
        for(int i=0;i+2<grid.length;i++){
            for(int j=0;j+2<grid[0].length;j++){
                if(right(i,j,grid)){
                    all++;
                }
            }
        }
        return all;
    }
    public boolean right(int row,int col,int grid[][]){
        int uSum = grid[row][col]+grid[row][col+1]+grid[row][col+2];

        HashSet<Integer> set = new HashSet<>();

        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                int val = grid[i][j];
                if(val <=0 || val > 9 || set.contains(val)){
                    return false;
                }
                set.add(val);
            }
        }
        for(int j=col;j<col+3;j++){
            int sum=0;
            for(int i=row;i<row+3;i++){
                int val = grid[i][j];
                sum += val;
            }
            if(sum != uSum){
                return false;
            }
        }
        for(int i=row;i<row+3;i++){
            int sum=0;
            for(int j=col;j<col+3;j++){
                int val = grid[i][j];
                sum += val;
            }
            if(sum != uSum){
                return false;
            }
        }
        int diaSum1 = grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int diaSum2 = grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col];
        if(diaSum1 != uSum || diaSum2 != uSum){
            return false;
        }
        return true;
    }
}